package com.example.rest.webservices.ticketbooking;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservices.ticketbooking.classes.User;
import com.example.rest.webservices.ticketbooking.classes.movies;
import com.example.rest.webservices.ticketbooking.dao.MovieRepository;
import com.example.rest.webservices.ticketbooking.dao.loginrepository;
@RestController
@CrossOrigin(origins="*")
@SpringBootApplication
public class TicketbookingApplication {
@Autowired
private loginrepository loginrepo;



@PostMapping("/register")
public String register(@RequestBody User user)
{
	loginrepo.save(user);
	return "hi";
}


@GetMapping("/getAllUsers")
public List<User> findAllUsers(){
	return loginrepo.findAll();
}
@GetMapping("/hello")
public String hello()
{
	return "Hello daaa";
}

@GetMapping("/findbyusername/{username}")
public User findbyusername(@PathVariable String username)
{
	return loginrepo.findByusername(username);
}
@Transactional
@DeleteMapping("/delete/{username}")
public void delete(@PathVariable String username)
{
	
	System.out.println(username);
	loginrepo.deleteByusername(username);
//	User user1=loginrepo.deleteByusername(username);
//	return user1;
}
@PutMapping("/update")
public User update(@RequestBody User user)
{
	User user1=loginrepo.findByid(user.id);
	user1.setUsername(user.username);
	user1.setPassword(user.password);
	loginrepo.save(user1);
	return user1;
}
@Autowired
private MovieRepository movierepo;
@GetMapping("/getmoviedetails/{moviename}")
public movies findmoviedetails(@PathVariable String moviename ){
	return movierepo.findByMoviename(moviename);
	
}

@GetMapping("/getAll")
public List<movies> getAll()
{
	return movierepo.findAll();
}
@GetMapping("/getByMoviePrice/{price}")
public List<movies> getByMoviePrice(@PathVariable int price)
{
	return movierepo.findByMovieprice(price);
}

	public static void main(String[] args) {
		SpringApplication.run(TicketbookingApplication.class, args);
	System.out.println("hello world");
	}
	

}
