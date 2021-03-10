package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.entity.Book;

@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource(collectionResourceRel = "books", path="books")
public interface BookRespository extends JpaRepository<Book, Long>{

}
