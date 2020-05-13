package com.spring.web.reactive.webclient.controller;

import com.spring.web.reactive.webclient.model.Employee;
import com.spring.web.reactive.webclient.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Mono<Employee> getById(@PathVariable String id) {
        return employeeService.getById(id);
    }

    @GetMapping
    public Flux<Employee> getAll() {
        return employeeService.getAll();
    }
}
