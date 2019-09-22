package com.citi.qfxlm.messaging;

import javax.jms.JMSException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citi.qfxlm.messaging.sr.MessageConstants;
import com.citi.qfxlm.messaging.sr.MessageSender;
import com.citi.qfxlm.messaging.sr.MessageSenderImpl;
import com.citi.qfxlm.messaging.sr.QFXLMReceiver;
import com.citi.qfxlm.messaging.sr.kafka.Greetings;
import com.citi.qfxlm.messaging.sr.kafka.GreetingsService;

@SpringBootApplication
//@QFXLMmessaging
public class Application implements CommandLineRunner {

	@Value("ibm.mq.name")
	String queuename;
	@Autowired
	MessageSenderImpl messageSender;
	@Autowired
	GreetingsService greetingsService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String msg = "ddnmf";
		try {
			Greetings greetings = new Greetings("dddddddd");
	        greetingsService.sendGreeting("Fdddd");

//			messageSender.send(MessageConstants.IBMMQ, msg, queuename);
//			messageSender.send(MessageConstants.EMS, msg, queuename);
		} catch (Exception ex) {
			System.out.println("error"+ ex.getMessage());
		}
		System.out.println("sending successfully" + msg);
	}

//	@QFXLMReceiver(queueName = "q")
//	public void receiveMsg(Object message) {
//
//		String mesg = (String) message;
//
//		System.out.println("received " + mesg);
//
//	}

}
