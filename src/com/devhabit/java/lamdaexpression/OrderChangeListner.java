package com.devhabit.java.lamdaexpression;

import com.devhabit.java.flatmap.mapreduce.Order;

/**
 * Used whenever there is a change in the order
 * @author bhavesh bhatt
 *
 */
public interface OrderChangeListner {
	
	public void onOrderChange(Order oldOrder,Order updatedOrder);

}
