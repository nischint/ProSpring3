package com.nischint.ch2;

public class HelloWorldMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider = null;
	
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of the class:"
							+ messageProvider.getClass().getName());
		} else {
			System.out.println(messageProvider.getMessage());
		}
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public MessageProvider getMessageReceiver() {
		return this.messageProvider;
	}

}
