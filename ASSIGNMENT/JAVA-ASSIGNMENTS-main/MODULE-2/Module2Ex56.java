package core_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Module2Ex56 {
  public static void main(String[] args) {
	ArrayList<String> arrayList1 = new ArrayList<>();
	
	arrayList1.add("1");
	arrayList1.add("2");
	arrayList1.add("3");
	arrayList1.add("4");
	
	System.out.println("List 1: " + arrayList1);
	
	ArrayList<String> arrayList2 = new ArrayList<>();
	
	arrayList2.add("A");
	arrayList2.add("B");
	arrayList2.add("C");
	arrayList2.add("D");
	
	System.out.println("List 2: " + arrayList2);
	
	Collections.copy(arrayList1, arrayList2);
	
	System.out.println("Array list 1: " + arrayList1);
	System.out.println("Array list 2: " + arrayList2);
	
	
 }
}
