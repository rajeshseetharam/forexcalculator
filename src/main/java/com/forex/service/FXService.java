package com.forex.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.forex.Constants;
import com.forex.input.InputParser;
import com.forex.input.InputParserImpl;
import com.forex.output.OutputPrinter;
import com.forex.rates.CurrencyConversionRates;
import com.forex.vo.Input;

public class FXService {

	private static final Logger log = LoggerFactory.getLogger(FXService.class);

	private InputParser inputParser = null;

	public FXService() {
		inputParser = new InputParserImpl();
	}

	public FXService(InputParser inputParser) {
		this.inputParser = inputParser;
	}

	public String execute(String[] command) {
		Input input = inputParser.parse(command);
		Double rate = null;

		if (input != null) {
			rate = CurrencyConversionRates.lookup(input.getFromCurrency(), input.getToCurrency());
		} else {
			return null;
		}

		if (rate != null) {
			log.debug("Conversion Rate from {} to {} : {}", input.getFromCurrency(), input.getToCurrency(), rate);
			String formattedOutput = OutputPrinter.convertAndPrint(input, rate);
			return formattedOutput;
		}

		String rule = CurrencyConversionRates.lookupRules(input.getFromCurrency(), input.getToCurrency());

		if (rule == null) {
			log.error("Could not convert currency for the given input");
			return null;
		}

		String formattedOutput = null;
		switch (rule) {
		case Constants.EQUALRATIO:
			rate = 1d;
			formattedOutput = OutputPrinter.convertAndPrint(input, rate);
			break;
		case Constants.DIR:
			rate = CurrencyConversionRates.lookup(input.getFromCurrency(), input.getToCurrency());
			formattedOutput = OutputPrinter.convertAndPrint(input, rate);
			break;
		case Constants.INV:
			rate = CurrencyConversionRates.lookup(input.getToCurrency(), input.getFromCurrency());
			formattedOutput = OutputPrinter.convertAndPrint(input, 1 / rate);
			break;
		default:
			String[] tempCommandLineArgs = null;
			String intermediateConversion = null;
			tempCommandLineArgs = new String[] { input.getFromCurrency(), "" + input.getFromCurrencyAmount(), "in",
					rule };
			intermediateConversion = execute(tempCommandLineArgs);
			tempCommandLineArgs = new String[] { rule, intermediateConversion, "in", input.getToCurrency() };
			return execute(tempCommandLineArgs);
		}
		return formattedOutput;
	}
}
