package com.manufacture.product;

public class ManufactureApp {
	ProductController productController = new ProductController();
	
	public void manufactureProduct(String rawProdcutMaterial) {
		Product baseProduct = productController.initateProductProcessing(rawProdcutMaterial);
		productController.buildProduct(baseProduct);
	}

	public static void main(String args[]) {
		ManufactureApp app = new ManufactureApp();
		String prodScheduleDetails = new ProductionScheduler().getScheduleDetailsFromOperator();
		for (Character rawProduct : prodScheduleDetails.toCharArray()) {
			app.manufactureProduct(rawProduct.toString());
		}
		System.out.println("All scheduled product build completed.");
	}
}