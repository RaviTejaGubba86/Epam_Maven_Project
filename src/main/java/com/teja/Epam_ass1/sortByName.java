package com.teja.Epam_ass1;
import java.util.Comparator;
public class sortByName implements Comparator<Sweet>{
	public int compare(Sweet s1,Sweet s2) {
		return s1.name.compareTo(s2.name);
	}
}
