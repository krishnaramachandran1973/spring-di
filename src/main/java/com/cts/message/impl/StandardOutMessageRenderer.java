package com.cts.message.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.message.MessageProvider;
import com.cts.message.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

	private static Logger logger = LoggerFactory.getLogger(StandardOutMessageRenderer.class);

	private MessageProvider messageProvider;

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("Set the MessageProvider of class" + StandardOutMessageRenderer.class.getName());
		}
		logger.info(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;

	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

}
