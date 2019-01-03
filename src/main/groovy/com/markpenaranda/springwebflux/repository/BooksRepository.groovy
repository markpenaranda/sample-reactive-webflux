package com.markpenaranda.springwebflux.repository

import com.markpenaranda.springwebflux.model.Book
import org.springframework.data.domain.Example
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.data.mongodb.repository.Tailable
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
public interface BooksRepository extends ReactiveMongoRepository<Book, String> {

    @Tailable
    Flux<Book> findByTitle(String title)

    @Tailable
    @Query("{}")
    Flux<Book> findAllBooks()
}
