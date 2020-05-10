package com.spring.web.reactive.webflux.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories("com.spring.web.reactive.webflux")
public class MongoConfig extends AbstractReactiveMongoConfiguration {


    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb://172.28.226.97");
    }

    @Override
    protected String getDatabaseName() {
        return "mydb";
    }
}