package core_Java;

import java.util.ArrayList;

public class Module2Ex53 {
   public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Abhishek Singh");
	arrayList.add("Nikhil Roshiya");
	arrayList.add("Ketan Bhatiya");
	
	System.out.println("Array list before removing name: " + arrayList);
	
	arrayList.remove(2);
	
	System.out.println("Array list after removing second index name: " + arrayList);
   }
}
