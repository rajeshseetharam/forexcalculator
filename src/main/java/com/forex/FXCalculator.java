package com.forex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.forex.service.FXService;

public class FXCalculator {

	private static final Logger log = LoggerFactory.getLogger(FXService.class);

	public static void main(String[] args) {
		FXService fxService = new FXService();
		String value = fxService.execute(args);
		if (value != null) {
			log.info("The conversion value for {} {} to {} is {} ", args[1], args[0].toUpperCase(),
					args[3].toUpperCase(), value);
			System.out.println("The conversion value for " + args[1] + " " + args[0].toUpperCase() + " to "
					+ args[3].toUpperCase() + " is " + value);
		}
	}
}
