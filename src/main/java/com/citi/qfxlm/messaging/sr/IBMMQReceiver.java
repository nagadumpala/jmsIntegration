package com.citi.qfxlm.messaging.sr;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class IBMMQReceiver {

	@JmsListener(destination = "")
	public void receive(Object mesg) {
		
	}
}
