package com.forex.rates;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrencyConversionRates {

	private static final Logger log = LoggerFactory.getLogger(CurrencyConversionRates.class);

	private static Map<String, Double> currencyConversionRates = new HashMap<String, Double>();

	private static Map<String, String> currencyConversionRules = new HashMap<String, String>();

	static {
		currencyConversionRates.put("AUDUSD", 0.8371);
		currencyConversionRates.put("CADUSD", 0.8711);
		currencyConversionRates.put("USDCNY", 6.1715);
		currencyConversionRates.put("EURUSD", 1.2315);
		currencyConversionRates.put("GBPUSD", 1.5683);
		currencyConversionRates.put("NZDUSD", 0.7750);
		currencyConversionRates.put("USDJPY", 119.95);
		currencyConversionRates.put("EURCZK", 27.6028);
		currencyConversionRates.put("EURDKK", 7.4405);
		currencyConversionRates.put("EURNOK", 8.6651);

		// CONVERSION RATES FOR AUD
		currencyConversionRules.put("AUDAUD", "1:1");
		currencyConversionRules.put("AUDCAD", "USD");
		currencyConversionRules.put("AUDCNY", "USD");
		currencyConversionRules.put("AUDCZK", "USD");
		currencyConversionRules.put("AUDDKK", "USD");
		currencyConversionRules.put("AUDEUR", "USD");
		currencyConversionRules.put("AUDGBP", "USD");
		currencyConversionRules.put("AUDJPY", "USD");
		currencyConversionRules.put("AUDNOK", "USD");
		currencyConversionRules.put("AUDNZD", "USD");
		currencyConversionRules.put("AUDUSD", "DIR");

		// CONVERSION RATES FOR CAD

		currencyConversionRules.put("CADAUD", "USD");
		currencyConversionRules.put("CADCAD", "1:1");
		currencyConversionRules.put("CADCNY", "USD");
		currencyConversionRules.put("CADCZK", "USD");
		currencyConversionRules.put("CADDKK", "USD");
		currencyConversionRules.put("CADEUR", "USD");
		currencyConversionRules.put("CADGBP", "USD");
		currencyConversionRules.put("CADJPY", "USD");
		currencyConversionRules.put("CADNOK", "USD");
		currencyConversionRules.put("CADNZD", "USD");
		currencyConversionRules.put("CADUSD", "DIR");

		// CONVERSION RATES FOR CNY

		currencyConversionRules.put("CNYAUD", "USD");
		currencyConversionRules.put("CNYCAD", "USD");
		currencyConversionRules.put("CNYCNY", "1:1");
		currencyConversionRules.put("CNYCZK", "USD");
		currencyConversionRules.put("CNYDKK", "USD");
		currencyConversionRules.put("CNYEUR", "USD");
		currencyConversionRules.put("CNYGBP", "USD");
		currencyConversionRules.put("CNYJPY", "USD");
		currencyConversionRules.put("CNYNOK", "USD");
		currencyConversionRules.put("CNYNZD", "USD");
		currencyConversionRules.put("CNYUSD", "DIR");

		// CONVERSION RATES FOR CZK

		currencyConversionRules.put("CZKAUD", "USD");
		currencyConversionRules.put("CZKCAD", "USD");
		currencyConversionRules.put("CZKCNY", "USD");
		currencyConversionRules.put("CZKCZK", "1:1");
		currencyConversionRules.put("CZKDKK", "EUR");
		currencyConversionRules.put("CZKEUR", "INV");
		currencyConversionRules.put("CZKGBP", "USD");
		currencyConversionRules.put("CZKJPY", "USD");
		currencyConversionRules.put("CZKNOK", "EUR");
		currencyConversionRules.put("CZKNZD", "USD");
		currencyConversionRules.put("CZKUSD", "EUR");

		// CONVERSION RATES FOR DKK

		currencyConversionRules.put("DKKAUD", "USD");
		currencyConversionRules.put("DKKCAD", "USD");
		currencyConversionRules.put("DKKCNY", "USD");
		currencyConversionRules.put("DKKCZK", "EUR");
		currencyConversionRules.put("DKKDKK", "1:1");
		currencyConversionRules.put("DKKEUR", "INV");
		currencyConversionRules.put("DKKGBP", "USD");
		currencyConversionRules.put("DKKJPY", "USD");
		currencyConversionRules.put("DKKNOK", "EUR");
		currencyConversionRules.put("DKKNZD", "USD");
		currencyConversionRules.put("DKKUSD", "EUR");

		// CONVERSION RATES FOR EUR

		currencyConversionRules.put("EURAUD", "USD");
		currencyConversionRules.put("EURCAD", "USD");
		currencyConversionRules.put("EURCNY", "USD");
		currencyConversionRules.put("EURCZK", "DIR");
		currencyConversionRules.put("EURDKK", "DIR");
		currencyConversionRules.put("EUREUR", "1:1");
		currencyConversionRules.put("EURGBP", "USD");
		currencyConversionRules.put("EURJPY", "USD");
		currencyConversionRules.put("EURNOK", "DIR");
		currencyConversionRules.put("EURNZD", "USD");
		currencyConversionRules.put("EURUSD", "DIR");

		// CONVERSION RATES FOR GBP

		currencyConversionRules.put("GBPAUD", "USD");
		currencyConversionRules.put("GBPCAD", "USD");
		currencyConversionRules.put("GBPCNY", "USD");
		currencyConversionRules.put("GBPCZK", "USD");
		currencyConversionRules.put("GBPDKK", "USD");
		currencyConversionRules.put("GBPEUR", "USD");
		currencyConversionRules.put("GBPGBP", "1:1");
		currencyConversionRules.put("GBPJPY", "USD");
		currencyConversionRules.put("GBPNOK", "USD");
		currencyConversionRules.put("GBPNZD", "USD");
		currencyConversionRules.put("GBPUSD", "DIR");

		// CONVERSION RATES FOR JPY

		currencyConversionRules.put("JPYAUD", "USD");
		currencyConversionRules.put("JPYCAD", "USD");
		currencyConversionRules.put("JPYCNY", "USD");
		currencyConversionRules.put("JPYCZK", "USD");
		currencyConversionRules.put("JPYDKK", "USD");
		currencyConversionRules.put("JPYEUR", "USD");
		currencyConversionRules.put("JPYGBP", "USD");
		currencyConversionRules.put("JPYJPY", "1:1");
		currencyConversionRules.put("JPYNOK", "USD");
		currencyConversionRules.put("JPYNZD", "USD");
		currencyConversionRules.put("JPYUSD", "INV");

		// CONVERSION RATES FOR NOK

		currencyConversionRules.put("NOKAUD", "USD");
		currencyConversionRules.put("NOKCAD", "USD");
		currencyConversionRules.put("NOKCNY", "USD");
		currencyConversionRules.put("NOKCZK", "EUR");
		currencyConversionRules.put("NOKDKK", "EUR");
		currencyConversionRules.put("NOKEUR", "INV");
		currencyConversionRules.put("NOKGBP", "USD");
		currencyConversionRules.put("NOKJPY", "USD");
		currencyConversionRules.put("NOKNOK", "1:1");
		currencyConversionRules.put("NOKNZD", "USD");
		currencyConversionRules.put("NOKUSD", "EUR");

		// CONVERSION RATES FOR NZD

		currencyConversionRules.put("NZDAUD", "USD");
		currencyConversionRules.put("NZDCAD", "USD");
		currencyConversionRules.put("NZDCNY", "USD");
		currencyConversionRules.put("NZDCZK", "USD");
		currencyConversionRules.put("NZDDKK", "USD");
		currencyConversionRules.put("NZDEUR", "USD");
		currencyConversionRules.put("NZDGBP", "USD");
		currencyConversionRules.put("NZDJPY", "USD");
		currencyConversionRules.put("NZDNOK", "USD");
		currencyConversionRules.put("NZDNZD", "1:1");
		currencyConversionRules.put("NZDUSD", "DIR");

		// CONVERSION RATES FOR USD
		currencyConversionRules.put("USDAUD", "INV");
		currencyConversionRules.put("USDCAD", "INV");
		currencyConversionRules.put("USDCNY", "INV");
		currencyConversionRules.put("USDCZK", "EUR");
		currencyConversionRules.put("USDDKK", "EUR");
		currencyConversionRules.put("USDEUR", "INV");
		currencyConversionRules.put("USDGBP", "INV");
		currencyConversionRules.put("USDJPY", "DIR");
		currencyConversionRules.put("USDNOK", "EUR");
		currencyConversionRules.put("USDNZD", "INV");
		currencyConversionRules.put("USDUSD", "1:1");

	}

	public static Double lookup(String fromCurrency, String toCurrency) {
		if (fromCurrency == null || toCurrency == null) {
			log.error("Invalid input currency");
			return null;
		}

		return currencyConversionRates.get(fromCurrency.toUpperCase() + toCurrency.toUpperCase());
	}

	public static String lookupRules(String fromCurrency, String toCurrency) {

		if (fromCurrency == null || toCurrency == null) {
			log.error("Invalid input currency");
			return null;
		}
		return currencyConversionRules.get(fromCurrency.toUpperCase() + toCurrency.toUpperCase());
	}

}
