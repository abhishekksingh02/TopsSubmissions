package core_Java;

import java.util.Scanner;

public class Module2Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		int letters = 0, spaces=0, numbers=0, others=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(ch[i]))
			{
				letters++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				spaces++;
			}
			else if(Character.isDigit(ch[i]))
			{
				numbers++;
			}
			else
			{
				others++;
			}
		}
			System.out.println("Your string is: "+str);
			System.out.println("Total letters in your string are: "+letters);
			System.out.println("Total Spaces in your string  are: "+spaces);
			System.out.println("Others are: "+ others);
}

}
