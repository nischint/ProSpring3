package com.nischint.ch2;

public class DecoupledHelloWorld {

	public static void main(String[] args) {
		MessageRenderer mr = new HelloWorldMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
