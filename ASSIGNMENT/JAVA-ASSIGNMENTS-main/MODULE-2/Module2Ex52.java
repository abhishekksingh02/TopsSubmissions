package core_Java;

import java.util.ArrayList;

public class Module2Ex52 {
  public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Abhishek Singh");
	arrayList.add("Nikhil Roshiya");
	arrayList.add("Ketan Bhatiya");
	
	System.out.println("Array List without any update in names: " + arrayList);
	
	// Updating the second element with different name
	
	arrayList.set(2, "Anshu");
	
	System.out.println("Array List after updating the second index element: " + arrayList);
}
}
