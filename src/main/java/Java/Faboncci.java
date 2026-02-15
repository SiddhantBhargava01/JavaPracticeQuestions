package Java;

import java.util.Scanner;

public class Faboncci {
	
	public void Fab(int rang, int N1, int N2){
		
		System.out.println("Here your Faboncci series: ");
		for(int i= rang; i>0;i--) {
			
			
			System.out.print(N1);
            if(i>1) {
				
				System.out.print(",");
			}
			int N3 = N1+N2;
			
			N1=N2;
			N2=N3;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the range: ");
		Scanner sc = new Scanner(System.in);
		
		int rang = sc.nextInt();
		
		System.out.println("Enter the N1 value please: ");
		int N1 = sc.nextInt();
		
		System.out.println("Please Enter the N2 value: ");
		int N2= sc.nextInt();
		
		Faboncci fb = new Faboncci();
		
		fb.Fab(rang, N1, N2);
		

	}

}
