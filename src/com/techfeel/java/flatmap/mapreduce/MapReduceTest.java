package com.techfeel.java.flatmap.mapreduce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author bhavesh bhatt
 *
 */
public class MapReduceTest {

	
	public static void main(String[] args) {
		List<Order> orderList = new ArrayList<Order>();
		LocalDate today = LocalDate.now();
		LocalDate oDate = today.plusDays(1);
		LocalDate oDate2 = today.plusDays(2);
		LocalDate oDate3 = today.plusDays(3);
		
		
		Order order1 = new Order(today,oDate,5000,"Mumbai");
		Order order2 = new Order(today,oDate2,6000,"Jaipur");
		Order order3 = new Order(today,oDate3,14000,"Indore");
		Order order4 = new Order(today,oDate,9000,"Bangalore");
		Order order5 = new Order(today,oDate2,9000,"Delhi");
		Order order6 = new Order(today,oDate3,11000,"Ahmedabad");
		
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		
		System.out.println("average order price before java 8 = " +averageOrderPrice(orderList));

		System.out.println("average order price with java 8 = " +averagePrice(orderList));
		List<Order> newOrderList = getOrderByDate(orderList,oDate2);
		System.out.println("orders before day after tomorrow = " +newOrderList.size());
		
	}
	/**
	 * This method should give all the order less than oDate2
	 * @param orderList
	 * @param oDate2
	 */
	private static List<Order> getOrderByDate(List<Order> orderList, LocalDate oDate2) {
		
		return orderList.stream().filter(o->o.getDeliveryDate().isBefore(oDate2)).collect(Collectors.toList());
		
	}
	/**
	 * This method should return average order price
	 * @param orderList
	 * @return
	 */
	public static double averageOrderPrice(List<Order> orderList) {
		
		double avgOrderPrice=0;
		int totVal = 0;
		for (Order order : orderList) {
			totVal = totVal + order.getOrderValue();
		}
		avgOrderPrice = totVal/orderList.size();
		return Math.round(avgOrderPrice);
	}
	/**
	 * This method should return average order price using java 8
	 * @param orderList
	 * @return
	 */
	public static double averagePrice(List<Order> orderList) {
		return orderList.stream().mapToInt(o->o.getOrderValue()).average().getAsDouble();
	}
}

