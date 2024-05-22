package core_Java;

import java.util.HashMap;
import java.util.Map;

public class Module2Ex62 {
  public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "Abhishek Singh");
	map.put(2, "1448520049");
	map.put(3, "Sem-VI");
	map.put(4, "Class: 301");
	map.put(4, "Course: BSc Mathematics");
	
	System.out.println(map);
	for(Map.Entry x : map.entrySet())
	{
		System.out.println(x.getKey()+ " " +x.getValue());
	}

	
	System.out.println("Size of above Hash map is: " + map.size());
 }
}
