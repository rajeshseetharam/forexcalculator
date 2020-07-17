package com.forex.output;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.forex.vo.Input;

public class OutputPrinter {
	private static final Logger log = LoggerFactory.getLogger(OutputPrinter.class);

	private static Map<String, DecimalFormat> printPrecision = new HashMap<String, DecimalFormat>();

	static {
		printPrecision.put("CAD", new DecimalFormat("#.##"));
		printPrecision.put("CNY", new DecimalFormat("#.##"));
		printPrecision.put("CZK", new DecimalFormat("#.##"));
		printPrecision.put("DKK", new DecimalFormat("#.##"));
		printPrecision.put("EUR", new DecimalFormat("#.##"));
		printPrecision.put("GBP", new DecimalFormat("#.##"));
		printPrecision.put("JPY", new DecimalFormat("#"));
		printPrecision.put("NOK", new DecimalFormat("#.##"));
		printPrecision.put("NZD", new DecimalFormat("#.##"));
		printPrecision.put("USD", new DecimalFormat("#.##"));
		printPrecision.put("AUD", new DecimalFormat("#.##"));
	}

	public static String convertAndPrint(Input input, Double rate) {
		
		if (input == null || rate == null)
			log.error("Invalid parameters input {}, rate {}", input, rate);

		double convertedRate = input.getFromCurrencyAmount() * rate.doubleValue();

		
		DecimalFormat formatter = printPrecision.get(input.getToCurrency());

		if (formatter == null)
			return "" + convertedRate;

		String convertedFormattedVal = formatter.format(convertedRate);
		log.debug("Conversion of {} {} to {} at rate {} --> {} {}", input.getFromCurrencyAmount(),
				input.getFromCurrency(), input.getToCurrency(), rate, convertedFormattedVal,input.getToCurrency());
		formatter = null;
		return convertedFormattedVal;
		
	}

}
