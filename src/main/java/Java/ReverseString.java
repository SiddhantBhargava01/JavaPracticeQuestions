package Java;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String arg[]) {
		
		//1. =This is the first way of doing Reverse String 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String s = sc.nextLine();
		
		/*
		String rev = "";
		
		int Slen = s.length();  //the char length count is 8
		
		//But the indexing value is start with 0 so the char length count is 7
		
		for(int i = Slen-1; i>=0; i--) {
			
			rev = rev +s.charAt(i);
			
		}
		System.out.println(rev);
		*/
		
		//2. = This is the second Way to Reverse String 
		
		StringBuffer str = new StringBuffer(s);
		
		System.out.println(str.reverse());
		
		
	}

}
