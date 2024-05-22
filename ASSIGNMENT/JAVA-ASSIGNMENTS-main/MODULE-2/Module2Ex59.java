package core_Java;

import java.util.HashSet;
import java.util.Iterator;

public class Module2Ex59 {
  public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
	
	set.add("Red");
	set.add("Green");
	set.add("Blue");
	set.add("Orange");
	set.add("Violet");
	
	Iterator<String> p = set.iterator();
	
	while(p.hasNext())
	{
		System.out.println(p.next());
	}
}
}
