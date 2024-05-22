package core_Java;

import java.util.ArrayList;

public class Module2Ex50 {
  public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Java");
	arrayList.add("C++");
	arrayList.add("Python");
	
	System.out.println("Original Array List: " + arrayList);
	
	String newElement = "PHP";
	arrayList.add(0, newElement);
	
	System.out.println("Array List after inserting new element at the first position: " + arrayList);
   }
}
