package com.citi.qfxlm.messaging.sr;

import javax.jms.JMSException;

public interface MessageSender {

	public void send(MessageConstants jmsType, Object msg,String queueName) throws JMSException;
	

}
