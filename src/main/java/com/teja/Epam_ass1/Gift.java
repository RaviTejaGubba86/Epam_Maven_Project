package com.teja.Epam_ass1;
import java.util.*;
public class Gift {
	LinkedList<Sweet> sweetobj;
	Gift(LinkedList<Sweet> sweets){
		this.sweetobj=sweets;
	}
	
	public Integer getTotalWeight() {
		int total_weight = 0;
		for(Sweet s:sweetobj)
			total_weight+=s.weight;
		return total_weight;
	}
	
	public void sortSweets(String parameter) {
		if (parameter.compareTo("name") == 0) {
			Collections.sort(sweetobj, new Comparator<Sweet>() {
				public int compare(Sweet s1, Sweet s2) {
				return s1.name.compareTo(s2.name);
				} } );
		}
		if (parameter.compareTo("weight") == 0) {
			Collections.sort(sweetobj, new Comparator<Sweet>() {
				public int compare(Sweet s1, Sweet s2) {
				return s1.weight-s2.weight;
				} } );
		}
	}
}
