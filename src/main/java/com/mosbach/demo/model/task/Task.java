package com.mosbach.demo.model.task;

public class Task {

	private String name = "";
	private String description = "";
	private int priority = 0;
	
	public Task() {
		
	}

	public Task(String name, String description, int priority) {
		super();
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
	
	
}
