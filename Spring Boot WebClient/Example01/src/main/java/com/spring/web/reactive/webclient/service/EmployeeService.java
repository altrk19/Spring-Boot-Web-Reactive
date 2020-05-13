package com.spring.web.reactive.webclient.service;

import com.spring.web.reactive.webclient.model.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {
    Mono<Employee> getById(String id);
    Flux<Employee> getAll();
}
