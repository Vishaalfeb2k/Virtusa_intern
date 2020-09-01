package com.example.rest.webservices.ticketbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.webservices.ticketbooking.classes.movies;

public interface MovieRepository extends CrudRepository<movies,Integer>
{
movies findByMoviename(String moviename);
	
List<movies> findByMovieprice(int price);
List<movies> findAll();
}
