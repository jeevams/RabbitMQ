package com.example.RabbitMq.services;

import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
	
	/*@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${javainuse.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${javainuse.rabbitmq.routingkey}")
	private String routingkey;	
	
	public void send(Employee company) {
		rabbitTemplate.convertAndSend(exchange, routingkey, company);
		
		System.out.println("Send msg = " + company);
	    
	}*/
}