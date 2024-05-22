package core_Java;

import java.util.ArrayList;

public class Module2Ex65 {
  public static void main(String[] args) {
	ArrayList<String> l1 = new ArrayList<>();
	l1.add("Red");
	l1.add("Black");
	l1.add("Orange");
	l1.add("Pink");
	
	ArrayList<String> l2 = new ArrayList<>();
	l2.add("Red");
	l2.add("Black");
	l2.add("Orange");
	l2.add("Violet");
	
	ArrayList<String> s3 = new ArrayList<String>();
	
	for(String e : l1)
		s3.add(l2.contains(e) ? "Yes" : "No");
	System.out.println(s3);
}
}
