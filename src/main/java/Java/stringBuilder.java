package Java;

import java.util.Scanner;

public class stringBuilder {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the sentence: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Reverse(s);
		
		
	}
	
	
	public static void Reverse(String sentence) {
		
		
		StringBuilder sb = new StringBuilder(sentence);
		boolean b = sb.reverse().toString().equals(sentence);
		System.out.println(b);
		
//		String result ="";
//		boolean b = true;
//		for(int i =sentence.length()-1; i>=0;i--) {
//			 
//			 result += sentence.charAt(i);
//		}
//		System.out.println(result);
//		
//		
//		if(sentence.equals(result)) {
//			System.out.println("if " + b);
//			
//		}else {
//			System.out.println(!b);
//			 
//		}
		
	}

}
