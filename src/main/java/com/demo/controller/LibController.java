package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Book;

import com.demo.repository.LibRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class LibController
{

	@Autowired
	private LibRepository lrepository;


	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertdata")
	public Book insertdata(@RequestBody Book b)
	{
		return this.lrepository.save(b);
	}

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updatedata")
	public Book updatedata(@RequestBody Book b)
	{
		return this.lrepository.save(b);
	}
	

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deletedata")
	public void deletedata(@RequestBody Book b)                    // update service
	{
		lrepository.delete(b);
		
	}
	

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewdata")
	public List<Book> viewdata() {
		return lrepository.findAll();
		
	}

}