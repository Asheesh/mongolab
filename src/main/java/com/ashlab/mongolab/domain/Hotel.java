package com.ashlab.mongolab.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Hotels")
public class Hotel {
	
	@Id
	private String id;
	private String name;	
	@Indexed(direction = IndexDirection.ASCENDING)
	private int price;
	private Address address;
	private List<Review> reviews;
	
	protected Hotel() {
		this.reviews = new ArrayList<>();
	}
	
	public Hotel(String name, int price, Address address, List<Review> reviews) {
		this.name = name;
		this.price = price;
		this.address = address;
		this.reviews = reviews;
	}

	public String getId() { return id;	}

	public String getName() { return name; }

	public int getPrice() { return price; }

	public Address getAddress() { return address; }

	public List<Review> getReviews() { return reviews; }
	

}
