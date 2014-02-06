package com.nischint.ch2;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {

	private static MessageSupportFactory instance = null;
	private static Properties props = null;
	private static MessageRenderer renderer = null;
	private static MessageProvider provider = null;

	private MessageSupportFactory() {
		props = new Properties();
		try {
			/*
			String current = new java.io.File( "." ).getCanonicalPath();
	        System.out.println("Current dir:"+current);
	        String currentDir = System.getProperty("user.dir");
	        System.out.println("Current dir using System:" +currentDir);
	        */
			props.load(new FileInputStream(
					"msf.properties"));
			renderer = (MessageRenderer) Class.forName(
					props.getProperty("renderer.class")).newInstance();
			provider = (MessageProvider) Class.forName(
					props.getProperty("provider.class")).newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}
}
