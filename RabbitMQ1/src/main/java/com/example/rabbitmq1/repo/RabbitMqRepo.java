package com.example.rabbitmq1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rabbitmq1.model.Employee;

public interface RabbitMqRepo extends JpaRepository<Employee, Integer> {

}
