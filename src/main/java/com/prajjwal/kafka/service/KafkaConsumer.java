package com.prajjwal.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.prajjwal.kafka.common.GlobalConstants;
import com.prajjwal.kafka.model.User;

@Service
public class KafkaConsumer {

	private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
	private static final String GROUP_ID = "prajjwal_spring_kafka_group";

	@KafkaListener(topics = GlobalConstants.KAFKA_TOPIC, groupId = KafkaConsumer.GROUP_ID)
	public void consume(User user) {
		log.info("Received message : {}", user);
	}
}
