package core_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Module2Ex55 {
   public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Zebra");
	arrayList.add("Lion");
	arrayList.add("Camel");
	arrayList.add("Elephant");
	
	System.out.println("Array before sorting: " + arrayList);
	
	Collections.sort(arrayList);
	
	System.out.println("Array list after sorting: " + arrayList);
  }
}
