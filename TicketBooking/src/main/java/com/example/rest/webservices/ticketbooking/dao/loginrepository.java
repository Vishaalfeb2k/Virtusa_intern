package com.example.rest.webservices.ticketbooking.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.webservices.ticketbooking.classes.User;

import java.util.List;

public interface loginrepository extends JpaRepository<User,Integer> {
    User findByusername(String username);
//    User findByrollno(String rollno);
    User findByid(int id);
//    User findById(in)
	void deleteByusername(String username);
}