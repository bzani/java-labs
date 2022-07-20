package com.bzani.labs.objs;

public enum EnumB {

	A(1, "a"), 
	B(2, "b"), 
	C(3, "c");
	
	private int id;
	private String description;
	
	private EnumB(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	
}
