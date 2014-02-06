package com.nischint.ch2;

public class FactoryHelloWorld {

	public static void main(String[] args) {
		MessageRenderer mr = MessageSupportFactory.getInstance()
				.getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance()
				.getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
