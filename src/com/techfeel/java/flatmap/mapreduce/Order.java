package com.techfeel.java.flatmap.mapreduce;

import java.time.LocalDate;

/**
 * @author bhavesh bhatt
 *
 */
public class Order {
	
	private LocalDate createdDate;
	private LocalDate deliveryDate;
	private Integer orderValue;
	private String place;
	
	public Order(LocalDate createdDate, LocalDate deliveryDate, Integer orderValue, String place) {
		super();
		this.createdDate = createdDate;
		this.deliveryDate = deliveryDate;
		this.orderValue = orderValue;
		this.place = place;
	}
	
	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Integer getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(Integer orderValue) {
		this.orderValue = orderValue;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
}