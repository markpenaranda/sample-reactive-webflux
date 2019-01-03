package com.markpenaranda.springwebflux.config

import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MongoConfig {

    @Bean MongoClient reactiveMongoClient () {
        return MongoClients.create("mongodb://127.0.0.1")
    }


}
