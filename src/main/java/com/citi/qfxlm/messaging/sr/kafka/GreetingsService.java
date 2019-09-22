package com.citi.qfxlm.messaging.sr.kafka;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class GreetingsService {

	   private final GreetingsStreams greetingsStreams;
	    public GreetingsService(GreetingsStreams greetingsStreams) {
	        this.greetingsStreams = greetingsStreams;
	    }
	    public void sendGreeting(String greetings) {
	        System.out.println("Sending greetings {}"+ greetings);
	        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
	        messageChannel.send(MessageBuilder
	                .withPayload(greetings)
	                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
	                .build());
	    }
}
