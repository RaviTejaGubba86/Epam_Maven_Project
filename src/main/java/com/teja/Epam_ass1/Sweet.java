package com.teja.Epam_ass1;

public abstract class Sweet {
	
	protected abstract String getType();
	int weight;
	String name;
	Sweet(String name,int weight){
		this.name = name;
		this.weight = weight;
	}
}
