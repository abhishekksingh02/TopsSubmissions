package core_Java;

public class Module2Ex19 {
    public static void main(String[] args) {
		 String str1 = "WX";
		 String str2 = "YZ";
		 
		 System.out.println("All interleaving of " + str1 + " and " + str2 + " :" );
		 printInterleavings("",str1,str2);
	}

	private static void printInterleavings(String interleaved, String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length()==0 && str2.length()==0) {
			System.out.println(interleaved);
		}
		if(str1.length() > 0)
		{
			printInterleavings(interleaved + str1.charAt(0), str1.substring(1), str2);
		}
		if(str2.length() > 0)
		{
			printInterleavings(interleaved + str2.charAt(0), str1, str2.substring(1));
		}
	}
}
