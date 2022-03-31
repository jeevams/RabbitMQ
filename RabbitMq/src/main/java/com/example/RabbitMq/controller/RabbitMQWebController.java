package com.example.RabbitMq.controller;


import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RabbitMq.Model.Employee;
import com.example.RabbitMq.config.RabbitMQConfig;

/*
@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSender rabbitMQSender;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
	
	Employee emp=new Employee();
	emp.setEmpId(empId);
	emp.setEmpName(empName);
		rabbitMQSender.send(emp);

		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

}*/

@RestController
public class RabbitMQWebController {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody Employee emp) {
    	
        template.convertAndSend(RabbitMQConfig.EXCHANGE,
        		RabbitMQConfig.ROUTING_KEY,emp);

        return "Message Published";
    }
    
    //@GetMapping("/getAll")
/*public List<Employee> getMessage() {
    	
      //  template.convertAndSend(RabbitMQConfig.EXCHANGE,
        //		RabbitMQConfig.ROUTING_KEY,emp);

    	  template.receiveAndConvert(RabbitMQConfig.QUEUE);
    	  return 
       
    }
  */  
    
    
}