package com.markpenaranda.springwebflux.resource

import com.markpenaranda.springwebflux.model.Book
import com.markpenaranda.springwebflux.repository.BooksRepository
import org.reactivestreams.Publisher
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class TestResource {

    @Autowired
    BooksRepository booksRepository

    

    @CrossOrigin(origins = "http://localhost:8000")
    @GetMapping(value = "/get/test", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Book> index () {
        booksRepository.findAllBooks()
    }


    @PostMapping("/post/test")
    public Mono<Book> test(@RequestBody Map request) {

        def book = new Book(request)
        return booksRepository.insert(book)

    }

}
