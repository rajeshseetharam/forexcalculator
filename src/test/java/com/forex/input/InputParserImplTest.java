package com.forex.input;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.forex.vo.Input;

public class InputParserImplTest {

	InputParser inputParser;

	@Before
	public void setUp() throws Exception {
		inputParser = new InputParserImpl();
	}

	@Test
	public void testParse() {
		Input input = inputParser.parse(new String[] { "kdjfk djfkd" });
		Assert.assertNull(input);
		
		input = null;
		Assert.assertNull(input);
		
		input = inputParser.parse(new String[] { "USD", "JKK", "in", "AUD" });
		Assert.assertNull(input);

		input = inputParser.parse(new String[] { "USD", "100.00", "in", "AUD" });
		Assert.assertNotNull(input);
		Assert.assertTrue(input.getFromCurrency().equals("USD"));
		Assert.assertTrue(input.getToCurrency().equals("AUD"));
		Assert.assertTrue(input.getFromCurrencyAmount() == 100.00);
	}

}
