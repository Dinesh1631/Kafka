package com.Kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {
	@Bean
	public NewTopic createTopic() {
		return new NewTopic("Dinesh_Routing",3, (short) 1);
	}

}
