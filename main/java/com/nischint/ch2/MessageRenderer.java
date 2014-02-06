package com.nischint.ch2;

public interface MessageRenderer {
	public void render();

	public void setMessageProvider(MessageProvider mr);

	public MessageProvider getMessageReceiver();
}
