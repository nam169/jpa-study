/*package com.namnh.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProducerServiceImpl.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void send(String topic, String payload) {
		LOGGER.info("Start send message");
		kafkaTemplate.send(topic, payload);
		LOGGER.info("Send message with topic: {}, payload: {}",topic, payload);
	}

}
*/