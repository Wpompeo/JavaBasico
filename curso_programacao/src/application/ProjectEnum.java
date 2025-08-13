package application;

import java.util.Date;

import entities.Order;
import entities.enums.Orderstatus;

public class ProjectEnum {
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), Orderstatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		Orderstatus os1 = Orderstatus.DELIVERED;
		Orderstatus os2 = Orderstatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}
}
