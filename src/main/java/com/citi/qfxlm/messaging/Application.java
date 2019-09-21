package com.citi.qfxlm.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citi.qfxlm.messaging.sr.AMQSender;
import com.citi.qfxlm.messaging.sr.QFXLMReceiver;



@SpringBootApplication
@QFXLMmessaging
public class Application implements CommandLineRunner {


	
	@Autowired
	AMQSender aMQSender;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String msg = "ddnmf";
		aMQSender.send(msg);
		System.out.println("sending successfully" + msg);
	}
	
	@QFXLMReceiver
	public void receiveMsg(Object message) {
		
		String mesg = (String) message;
		
		System.out.println("received " + mesg);

	}


}
