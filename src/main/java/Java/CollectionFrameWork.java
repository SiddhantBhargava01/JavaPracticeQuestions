package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionFrameWork {
	
	
	public static void ArryList() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of value: ");
	      int rang = sc.nextInt();
	 
		System.out.println("Enter the values: ");
		int values;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		
		for(int n = 0; n<=rang-1; n++ ) {
			
			values = sc.nextInt();
			list.add(values);
		}
		System.out.print(list);
	}
	public static void main(String[] args) {
		
		ArryList();
	}

}
