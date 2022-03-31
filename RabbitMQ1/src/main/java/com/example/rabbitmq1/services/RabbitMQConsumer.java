package com.example.rabbitmq1.services;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rabbitmq1.config.MQConfig;
import com.example.rabbitmq1.model.Employee;
import com.example.rabbitmq1.repo.RabbitMqRepo;

@Component
public class RabbitMQConsumer {

	
	@Autowired
	RabbitMqRepo rabbitMqRepo;
	
	@RabbitListener(queues = MQConfig.QUEUE)
    public void listener(Employee message) {
		rabbitMqRepo.save(message);
        System.out.println(message);
    }
	
	/*public List<Employee> getAll( ) {
		return rabbitMqRepo.findAll();
        //System.out.println(message);
    }*/
	
	
}