package core_Java;

import java.util.ArrayList;

public class Module2Ex54 {
  public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Red");
	arrayList.add("White");
	arrayList.add("Orange");
	arrayList.add("Blue");
	
	// Searching the value white in the array list
	if(arrayList.contains("White"))
	{
		System.out.println("Found the element.");
	}
	else
	{
		System.out.println("Error occurred: There is no such element found.");
	}
  }
}
