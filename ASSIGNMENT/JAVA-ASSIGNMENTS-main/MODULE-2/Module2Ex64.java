package core_Java;

import java.util.ArrayList;
import java.util.List;

public class Module2Ex64 {
  public static void main(String[] args) {
	  ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Organge");
		arrayList.add("Blue");
		arrayList.add("Violet");
		arrayList.add("Pink");
		
		System.out.println("Original list: " + arrayList);
		
		List<String> sub_list = arrayList.subList(0,3);
		
		System.out.println("List of first three elements: " + sub_list);
  }
}
