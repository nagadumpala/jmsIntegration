package com.citi.qfxlm.messaging.sr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.connection.JmsTransactionManager;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.ibm.msg.client.wmq.WMQConstants;

@Configuration
@EnableTransactionManagement
@EnableJms
public class EMSConfig {
//	TibjmsConnectionFactory
//    @Value("${ibm.mq.hostName}")
//    private String host;
//    @Value("${ibm.mq.portName}")
//    private Integer port;
//    @Value("${ibm.mq.queueManager}")
//    private String queueManager;
//    @Value("${ibm.mq.channel}")
//    private String channel;
//    @Value("${ibm.mq.user}")
//    private String username;
//    @Value("${ibm.mq.password}")
//    private String password;
//
//    		
//
//    @Bean
//    public MQQueueConnectionFactory mqQueueConnectionFactory() {
//        MQQueueConnectionFactory mqQueueConnectionFactory = new MQQueueConnectionFactory();
//        mqQueueConnectionFactory.setHostName(host);
//        try {
//            mqQueueConnectionFactory.setTransportType(WMQConstants.WMQ_CM_CLIENT);
//            mqQueueConnectionFactory.setCCSID(1208);
//            mqQueueConnectionFactory.setChannel(channel);
//            mqQueueConnectionFactory.setPort(port);
//            mqQueueConnectionFactory.setQueueManager(queueManager);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return mqQueueConnectionFactory;
//    }
//
//    @Bean
//    UserCredentialsConnectionFactoryAdapter userCredentialsConnectionFactoryAdapter(MQQueueConnectionFactory mqQueueConnectionFactory) {
//        UserCredentialsConnectionFactoryAdapter userCredentialsConnectionFactoryAdapter = new UserCredentialsConnectionFactoryAdapter();
//        userCredentialsConnectionFactoryAdapter.setUsername(username);
//        userCredentialsConnectionFactoryAdapter.setPassword(password);
//        userCredentialsConnectionFactoryAdapter.setTargetConnectionFactory(mqQueueConnectionFactory);
//        return userCredentialsConnectionFactoryAdapter;
//    }
//
//    @Bean
//    @Primary
//    public CachingConnectionFactory cachingConnectionFactory(UserCredentialsConnectionFactoryAdapter userCredentialsConnectionFactoryAdapter) {
//        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
//        cachingConnectionFactory.setTargetConnectionFactory(userCredentialsConnectionFactoryAdapter);
//        cachingConnectionFactory.setSessionCacheSize(500);
//        cachingConnectionFactory.setReconnectOnException(true);
//        return cachingConnectionFactory;
//    }
//
//    @Bean
//    public PlatformTransactionManager jmsIBMMQTransactionManager(CachingConnectionFactory cachingConnectionFactory) {
//        JmsTransactionManager jmsTransactionManager = new JmsTransactionManager();
//        jmsTransactionManager.setConnectionFactory(cachingConnectionFactory);
//        return jmsTransactionManager;
//    }
//
//    @Bean
//    public JmsTemplate mqJMSOperations(CachingConnectionFactory cachingConnectionFactory) {
//        JmsTemplate jmsTemplate = new JmsTemplate(cachingConnectionFactory);
//        return jmsTemplate;
//    }
//    
}
