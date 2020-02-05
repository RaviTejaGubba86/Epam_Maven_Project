package com.teja.Epam_ass1;

public class Chocolate extends Sweet{ //Implementing Inheritance
	public String getType() {
		return "Chocolate";
	}
	Chocolate(String name,int weight){
		super(name,weight);
	}
}
