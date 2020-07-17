package com.forex.output;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.forex.vo.Input;

public class OuputPrinterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testConvertAndPrint() {

		Input input = new Input("AUD", "USD", 100.00);
		String convertedFormattedAmount = OutputPrinter.convertAndPrint(input, 0.8371);
		Assert.assertEquals("83.71", convertedFormattedAmount);

		input = new Input("USD", "JPY", 1000.00);
		convertedFormattedAmount = OutputPrinter.convertAndPrint(input, 119.95);
		Assert.assertEquals("119950", convertedFormattedAmount);
		
		input = new Input("AUD","JPY",200.00);
		convertedFormattedAmount = OutputPrinter.convertAndPrint(input, 100.41);
		Assert.assertEquals("20082", convertedFormattedAmount);
	}

}
