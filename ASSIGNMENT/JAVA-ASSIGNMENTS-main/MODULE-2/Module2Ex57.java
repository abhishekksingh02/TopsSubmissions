package core_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Module2Ex57 {
  public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Red");
	arrayList.add("Blue");
	arrayList.add("Orange");
	arrayList.add("Green");
	arrayList.add("Violet");
	
	System.out.println("Array list before shuffling: " + arrayList);
	
	Collections.shuffle(arrayList);
	
	System.out.println("Array List after shuffling: " + arrayList);
}
}
