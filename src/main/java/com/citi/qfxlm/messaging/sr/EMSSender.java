package com.citi.qfxlm.messaging.sr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EMSSender {

	@Autowired
	JmsTemplate mqJMSOperations;
	
	@Transactional(value="jmsIBMMQTransactionManager")
	public void send(String queueName, Object msg ) {
		mqJMSOperations.convertAndSend(queueName, msg);
		
	}
}
