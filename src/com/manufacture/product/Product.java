package com.manufacture.product;

import java.util.Map;

public class Product {
	public String name;
	public boolean isManufacturingCompleted = false;
	public Map<String, Stage> stageInfo;

	public void showDetails() {
		System.out.println("Product Name :" + name);
		System.out.println("Details -");
		for (String prodName : stageInfo.keySet()) {
			Stage stage = stageInfo.get(prodName);
			System.out.println(stage.name + " Duration :" + stage.timeDuration + "min");
		}
		System.out.println("----------------------------\n");
	}

}
