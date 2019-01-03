package com.markpenaranda.springwebflux

import com.mongodb.async.client.MongoClients
import com.mongodb.client.MongoClient
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
class SpringWebfluxApplication {


	static void main(String[] args) {
		SpringApplication.run(SpringWebfluxApplication, args)
	}

}



