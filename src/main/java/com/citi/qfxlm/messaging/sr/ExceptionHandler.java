package com.citi.qfxlm.messaging.sr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHandlingException;
import org.springframework.stereotype.Service;
import org.springframework.util.ErrorHandler;

@Service
public class ExceptionHandler implements ErrorHandler {

	@Override
	public void handleError(Throwable t) {

		if (t instanceof MessageHandlingException) {
            MessageHandlingException exception = (MessageHandlingException) t;
            if (exception != null) {
                org.springframework.messaging.Message<?> message = exception.getFailedMessage();
                Object payloadObject = message.getPayload();
                if (null != payloadObject) {
                	System.out.println("exception --->" + exception.getMessage());

                	System.out.println("Payload request is: " + payloadObject);
//                    LOG.info("Payload  is not null, type is: " + payloadObject);
                }
            }
        } else {
//            log.info("Exception is not of type: MessageHandlingException ");
        }		
	}

}
