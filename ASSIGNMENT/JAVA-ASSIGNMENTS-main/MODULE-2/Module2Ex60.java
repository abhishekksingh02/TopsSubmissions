package core_Java;

import java.util.HashSet;

public class Module2Ex60 {
  public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	
	set.add("Red");
	set.add("Blue");
	set.add("White");
	set.add("Null");
	set.add("Violet");
	
	System.out.println("Original Hash set is: " + set);
	System.out.println("Size of the above hash set is: " + set.size());
  }
}
