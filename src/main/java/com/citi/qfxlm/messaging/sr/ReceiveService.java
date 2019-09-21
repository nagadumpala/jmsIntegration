package com.citi.qfxlm.messaging.sr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class ReceiveService  {
	public Object processMsg(Message<?> msg) {
	
		System.out.println("received " + (String)msg.getPayload());

		return msg.getPayload();
	}


}
