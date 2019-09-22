package com.citi.qfxlm.messaging.sr;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Service;
@Service
//@MessagingGateway
public class MessageSenderImpl implements MessageSender {

	@Autowired
	IBMMQSender iBMMQSender;
	
	@Autowired
	EMSSender eMSSender;

	@Override
	public void send(MessageConstants jmsType, Object msg, String queueName) throws JMSException{

		switch (jmsType) {
		case IBMMQ:
			iBMMQSender.send(queueName, msg);
			break;
		case KAFKA:
			
			break;

		case EMS:
			eMSSender.send(queueName, msg);
			break;

		default:
		}
	}

}
