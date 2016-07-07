package com.manufacture.product;

import java.util.Scanner;

public class ProductionScheduler {

	public String getScheduleDetailsFromOperator() {
		System.out.println(
				"Please enter product details to setup the schedule. For e.g. XXY, where X,Y represents prduct names.");
		Scanner scanner = new Scanner(System.in);
		String productSchedules = scanner.nextLine();
		return productSchedules;
	}

}
