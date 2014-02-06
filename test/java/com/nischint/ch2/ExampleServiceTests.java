package com.nischint.ch2;

import com.nischint.ch2.ExampleService;
import junit.framework.TestCase;

public class ExampleServiceTests extends TestCase {

	private ExampleService service = new ExampleService();

	public void testReadOnce() throws Exception {
		assertEquals("Hello world!", service.getMessage());
	}

}
