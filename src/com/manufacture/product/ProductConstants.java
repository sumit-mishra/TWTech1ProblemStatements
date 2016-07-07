package com.manufacture.product;

enum ProductConstants {

	X, Y;

	private static int duration;

	public static int processDuration(String stage, String productName) {
		if (productName.equals("X")) {
			return processDurationX(stage);
		}
		if (productName.equals("Y")) {
			return processDurationY(stage);
		}
		return 0;
	}

	private static int processDurationX(String stage) {
		if (stage.equalsIgnoreCase("stage1")) {
			duration = 90;
		} else if (stage.equalsIgnoreCase("stage2")) {
			duration = 30;
		} else if (stage.equalsIgnoreCase("stage3")) {
			duration = 40;
		} else if (stage.equalsIgnoreCase("stage4")) {
			duration = 60;
		}
		return duration;
	}

	private static int processDurationY(String stage) {
		if (stage.equalsIgnoreCase("stage1")) {
			duration = 30;
		} else if (stage.equalsIgnoreCase("stage2")) {
			duration = 90;
		} else if (stage.equalsIgnoreCase("stage3")) {
			duration = 60;
		} else if (stage.equalsIgnoreCase("stage4")) {
			duration = 45;
		}
		return duration;
	}

}
