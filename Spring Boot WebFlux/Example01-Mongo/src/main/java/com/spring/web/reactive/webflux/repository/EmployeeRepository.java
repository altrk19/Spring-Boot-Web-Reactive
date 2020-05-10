package com.spring.web.reactive.webflux.repository;

import com.spring.web.reactive.webflux.entity.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
