package core_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Module2Ex49 {
    public static void main(String[] args) {
		 
    	ArrayList <String> arrayList = new ArrayList<>();
    	
    	arrayList.add("Abhishek Singh");
    	arrayList.add("Nikhil Roshiya");
    	arrayList.add("Ketan Bhatiya");
    	arrayList.add("Sheeeeerrrr");
    	
    	Iterator i = arrayList.iterator();
    	
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
	}
}
