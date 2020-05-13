package com.spring.web.reactive.webclient.service;

import com.spring.web.reactive.webclient.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private WebClient webClient;

    public EmployeeServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Mono<Employee> getById(String id) {
        return webClient.get()
                .uri("/employees/"+ id)
                .retrieve()
                /*.onStatus(httpStatus -> HttpStatus.NOT_FOUND.equals(httpStatus),
                        clientResponse -> Mono.empty())*/
                .bodyToMono(Employee.class);
    }

    @Override
    public Flux<Employee> getAll() {
        return webClient.get()
                .uri("/employees")
                .retrieve()
                .bodyToFlux(Employee.class)
                .timeout(Duration.ofMillis(10_000));
    }
}
