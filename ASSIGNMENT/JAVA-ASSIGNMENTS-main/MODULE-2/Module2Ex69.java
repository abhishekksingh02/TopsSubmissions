package core_Java;

import java.util.HashSet;

public class Module2Ex69 {
   public static void main(String[] args) {
	   HashSet<String> set = new HashSet<String>();
		set.add("red");
		set.add("white");
		set.add("orange");
		set.add("blue");
		set.add("violet");
		
		System.out.println("Original hash set: " + set);
		
		// Creating an array
		 String[] new_array = new String[set.size()];
		 set.toArray(new_array);
		
		 // Displaying array elements
		 System.out.println("Array elements: ");
		  for(String element : new_array)
		  {
			  System.out.println(element);
		  }
}
}
