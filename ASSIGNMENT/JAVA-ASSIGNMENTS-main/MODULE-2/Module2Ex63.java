package core_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Module2Ex63 {
  public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Organge");
	arrayList.add("Blue");
	arrayList.add("Violet");
	arrayList.add("Pink");
	
	System.out.println("Array list before reverse: " + arrayList);
	
	Collections.reverse(arrayList);
	
	System.out.println("Array list after reverse: " + arrayList);
}
}
