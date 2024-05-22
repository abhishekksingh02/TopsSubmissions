package core_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Module2Ex66 {
  public static void main(String[] args) {
	  ArrayList<String> l1 = new ArrayList<>();
		l1.add("Red");
		l1.add("Black");
		l1.add("Orange");
		l1.add("Pink");
		
		System.out.println("Array list before Swap: ");
		
		for(String a: l1) {
			System.out.println(a);
		}
		// Swapping zeroth index element with the second index element
		Collections.swap(l1, 0, 2);
		System.out.println("Array list after Swap: ");
		for(String b: l1) {
			System.out.println(b);
		}
   }
}
