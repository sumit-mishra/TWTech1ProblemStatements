package com.manufacture.product;

public class Stage {
	public String name;
	public String timeDuration;

	public Stage(String name, String timeDuration) {
		this.name = name;
		this.timeDuration = timeDuration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}
}
