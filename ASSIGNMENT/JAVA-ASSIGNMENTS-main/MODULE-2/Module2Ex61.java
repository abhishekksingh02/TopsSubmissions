package core_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Module2Ex61 {
  public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "Abhishek Singh");
	map.put(2, "Nikhil Roshiya");
	map.put(3, "Ketan Bhatiya");
	map.put(4, "Null Character");
	
	System.out.println(map);
	
//	for(Entry m : map.entrySet())
//	{
//		System.out.println(m.getKey());
//		System.out.println(m.getValue());
//	}
	for(Map.Entry x : map.entrySet())
	{
		System.out.println(x.getKey()+ " " +x.getValue());
	}
}
}
