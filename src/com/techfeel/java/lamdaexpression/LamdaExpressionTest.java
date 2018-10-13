package com.techfeel.java.lamdaexpression;

import java.time.LocalDate;

import com.techfeel.java.flatmap.mapreduce.Order;

/**
 * @author bhavesh bhatt
 *
 */
public class LamdaExpressionTest {
	
	public static void main(String[] args) {

		LamdaExpressionTest lamda = new LamdaExpressionTest();
		
		/** 
		 * code without lamda expression
		 */
		lamda.addOrderChangeListener(new OrderChangeListner() {
			
				public void onOrderChange(Order oldOrder,Order updatedOrder) {
				System.out.println("old order value = " +oldOrder.getOrderValue());
				System.out.println("updated order value = " +updatedOrder.getOrderValue());
				System.out.println("order value difference= " +Math.subtractExact(updatedOrder.getOrderValue(),oldOrder.getOrderValue()));
			}
		});	
		/**
		 * code with lamda expression
		 */
		lamda.addOrderChangeListener(
				(oldOrder,updatedOrder) -> {
					System.out.println("old order value = "+oldOrder.getOrderValue());
					System.out.println("updated order value = " +updatedOrder.getOrderValue());
					System.out.println("order value difference= " +Math.subtractExact(updatedOrder.getOrderValue(),oldOrder.getOrderValue()));
				}
		);
	}
	public void addOrderChangeListener(OrderChangeListner listener) { 
		LocalDate today = LocalDate.now();
		LocalDate oDate = today.plusDays(1);
		LocalDate oDate2 = today.plusDays(2);
		Order oldOrder = new Order(today,oDate,5000,"Mumbai");
		Order updatedOrder = new Order(today,oDate2,6000,"Jaipur");
		listener.onOrderChange(oldOrder, updatedOrder);
	
	}
	
}
