package core_Java;

public class Module2Ex16 {
	public static void main(String[] args) {
		String s1 = "topsint.com";
		String s2 = "topsint.com";
		String s3 = "Topsint.com";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println("----------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println("----------------");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		System.out.println("-----------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
