package com.forex.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FXServiceTest {

	private static final Logger log = LoggerFactory.getLogger(FXServiceTest.class);

	FXService fxService;

	@Before
	public void setUp() throws Exception {
		fxService = new FXService();
	}

	@Test
	public void testExecute() {
		String[] command = new String[] { "AUD", "100", "in", "USD" };
		String output = fxService.execute(command);
		Assert.assertNotNull(output);
		log.info("{} {} = {} {}", command[1], command[0], output, command[3]);
		
		
		command = new String[] { "AUD", "100", "in", "AUD" };
		output = fxService.execute(command);
		Assert.assertNotNull(output);
		log.info("{} {} = {} {}", command[1], command[0], output, command[3]);
		
		command = new String[] { "AUD", "100", "in", "JPY" };
		output = fxService.execute(command);
		Assert.assertNotNull(output);
		log.info("{} {} = {} {}", command[1], command[0], output, command[3]);

		command = new String[] { "USD", "100", "in", "AUD" };
		output = fxService.execute(command);
		Assert.assertNotNull(output);
		log.info("{} {} = {} {}", command[1], command[0], output, command[3]);

		command = new String[] { "USD", "100", "in", "NOK" };
		output = fxService.execute(command);
		Assert.assertNotNull(output);
		log.info("{} {} = {} {}", command[1], command[0], output, command[3]);
		
		
		command = new String[] { "NOK", "100", "in", "USD" };
		output = fxService.execute(command);
		Assert.assertNotNull(output);
		log.info("{} {} = {} {}", command[1], command[0], output, command[3]);

	}

}
