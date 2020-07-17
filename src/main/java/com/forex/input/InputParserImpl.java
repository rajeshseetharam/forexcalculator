package com.forex.input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.forex.vo.Input;

public class InputParserImpl implements InputParser {
	private static final Logger log = LoggerFactory.getLogger(InputParserImpl.class);

	public Input parse(String[] command) {

		if (!isValid(command)) {
			return null;
		}
		return new Input(command[0].toUpperCase(), command[3].toUpperCase(), Double.parseDouble(command[1]));
	}

	private boolean isValid(String[] command) {
		if (command == null || command.length != 4) {
			log.error("Invalid command input. USAGE [\"<ccy1> <amount> in <ccy2>\"]");
			return false;
		}

		if (command[0].length() != 3 || command[3].length() != 3 || !"in".equalsIgnoreCase(command[2])) {
			log.error("Invalid command input. USAGE [\"<ccy1> <amount> in <ccy2>\"]");
			return false;
		}

		try {
			Double.parseDouble(command[1]);
		} catch (NumberFormatException nfe) {
			log.error("Currency Amount not a Number.");
			return false;
		}
		return true;
	}

}
