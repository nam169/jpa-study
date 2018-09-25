/*package com.namnh.service.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.namnh.common.Constant;

@Component
@KafkaListener(id="0",topics=Constant.UPDATE_ACCOUT_TOPIC)
public class ConsumerServiceImpl implements Consumer{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerServiceImpl.class);
	
	@KafkaHandler(isDefault=true)
	public void consumer(ConsumerRecord<?,?> consumerRecord) {
		LOGGER.info("Start recieve message");
		LOGGER.info("Recieve message: {}",consumerRecord);
	}

}
*/