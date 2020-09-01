package com.example.rest.webservices.ticketbooking.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="Movies")
public class movies {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String moviename;
private int movieprice;
private String moviedescription;
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public int getMovieprice() {
	return movieprice;
}
public void setMovieprice(int movieprice) {
	this.movieprice = movieprice;
}
public String getMoviedescription() {
	return moviedescription;
}
public void setMoviedescription(String moviedescription) {
	this.moviedescription = moviedescription;
}
	
	
}
