package com.teja.Epam_ass1;

public class Candy extends Sweet{ //Implementing Inheritance
	public String getType() {
		return "Candy";
	}
	Candy(String name,int weight){
		super(name,weight); 
	}
}
