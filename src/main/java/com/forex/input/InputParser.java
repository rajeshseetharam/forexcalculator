package com.forex.input;

import com.forex.vo.Input;

public interface InputParser {
	
	Input parse(String[] command);
	
}
