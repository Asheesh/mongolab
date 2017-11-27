package com.ashlab.mongolab.domain;

public class Review {
	
	private String userName;
	private int rating;
	private boolean isApproved;
	
	protected Review() {};
	
	public Review(String userName, int rating, boolean isApproved) {
		this.userName = userName;
		this.rating = rating;
		this.isApproved = isApproved;
	}

	public String getUserName() { return userName; }

	public int getRating() { return rating; }

	public boolean isApproved() { return isApproved; }

}
