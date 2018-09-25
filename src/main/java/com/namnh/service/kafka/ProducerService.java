package com.namnh.service.kafka;

public interface ProducerService {
	public void send(String topic, String payload);

}
