package com.manufacture.product;

import java.util.LinkedHashMap;

public class ProductController {

	/* According to product it initializes with all the default values */
	public Product initateProductProcessing(String productName) {
		Product product = new Product();
		product.name = productName;
		product.isManufacturingCompleted = false;
		product.stageInfo = new LinkedHashMap<>();
		return product;
	}

	public void buildProduct(Product product) {
		while (!product.isManufacturingCompleted) {
			forwardProductToNextStage(product);
		}
	}

	private void forwardProductToNextStage(Product product) {
		int stageNo = product.stageInfo.size() + 1;
		String nextStage = "stage" + stageNo;
		String nextStageDuration = String.valueOf(ProductConstants.processDuration(nextStage, product.name));
		Stage stage = new Stage(nextStage, nextStageDuration);
		product.stageInfo.put(nextStage, stage);
		
		if (nextStage.equals("stage4")) {
			product.isManufacturingCompleted = true;
			product.showDetails();
		}
	}
}
