package com.markpenaranda.springwebflux.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Book {

    @Id
    String id;
    String title;

}
