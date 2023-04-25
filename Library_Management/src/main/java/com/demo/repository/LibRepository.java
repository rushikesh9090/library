package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Book;


@Repository
public interface LibRepository extends JpaRepository<Book,Integer>
{

}
