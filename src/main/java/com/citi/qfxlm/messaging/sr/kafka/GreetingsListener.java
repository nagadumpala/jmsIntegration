package com.citi.qfxlm.messaging.sr.kafka;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

public class GreetingsListener {

	 @StreamListener(GreetingsStreams.INPUT)
	    public void handleGreetings(@Payload String greetings) {
		 System.out.println("Received greetings: {}"+ greetings);
	    }
}
