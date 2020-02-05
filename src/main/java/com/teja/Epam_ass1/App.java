package com.teja.Epam_ass1;

import java.util.Scanner;
import java.util.LinkedList;

public class App 
{
    private static Scanner in;

	public static void main( String[] args )
    {
        in = new Scanner(System.in);
        LinkedList<Sweet> sobj = new LinkedList<Sweet>();
        
        //Adding Sweets
        sobj.add(new Sweet("Diary Milk Crackle",40) {
        	@Override protected String getType() {
        		return "Chocolate";
        	}
        }); //Implementing Polymorphism 
        sobj.add(new Chocolate("5Star",10));
        sobj.add(new Chocolate("Munch",20));
        sobj.add(new Sweet("Creamfillz",5) {
        	@Override protected String getType() {
        		return "Candy";
        	}
        }); // Implementing Polymorphism
        sobj.add(new Candy("Mango Bite",3));
        sobj.add(new Candy("Pulse",4));
        
        //Calculating total weight of sweets
        Gift g=new Gift(sobj);
        int total_weight = g.getTotalWeight();
        System.out.println("The total weight of sweets present is: "+total_weight);
        System.out.print("Enter 'name' or 'weight' to print the sweets in a sorted manner accordingly: ");
        String parameter = in.nextLine();
        if (parameter.compareTo("name") == 0) {
        	g.sortSweets("name");
        	System.out.println("Sweets in sorted order based on names: ");
        	for(Sweet s: g.sweetobj) {
        		System.out.println(s.name +"-------------"+ String.valueOf(s.weight));
        	}
        }
        if(parameter.compareTo("weight") == 0) {
        	g.sortSweets("weight");
        	System.out.println("Sweets in sorted order based on weights: ");
        	for(Sweet s: g.sweetobj) {
        		System.out.println(s.name +"-------------"+ String.valueOf(s.weight));
        	}
        }
    }
}
