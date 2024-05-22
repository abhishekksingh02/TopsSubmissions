package core_Java;

import java.util.ArrayList;

//import javax.swing.ListCellRenderer;

public class Module2Ex51 {
   public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
	
	arrayList.add("Red");
	arrayList.add("Green");
	arrayList.add("Blue");
	arrayList.add("Black");
	
	System.out.println(arrayList);
	
	String element = arrayList.get(0);
	System.out.println("First Element: " + element);
	
	element = arrayList.get(2);
	System.out.println("Third Element: " + element);
}
}
