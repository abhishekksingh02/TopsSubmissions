package core_Java;

import java.util.ArrayList;
import java.util.HashSet;

public class Module2Ex74 {
  public static void main(String[] args) {
	HashSet<String> set1 = new HashSet<String>();
	
	set1.add("Red");
	set1.add("Orange");
	set1.add("Blue");
	set1.add("Green");
	
	System.out.println("First Hash Set content: " + set1);
	
	HashSet<String> set2 = new HashSet<String>();
	
	set2.add("Red");
	set2.add("Orange");
	set2.add("Blue");
	set2.add("Green");
	set2.add("Pink");
	
	System.out.println("Second Hash Set content: " + set2);
	
	set1.retainAll(set2);
	System.out.println("HashSet Content: ");
	System.out.println(set1);
}
}
