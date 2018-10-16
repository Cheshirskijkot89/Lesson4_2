package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		int numb;
		int fact;
		Scanner sc = new Scanner(System.in);
		
		fact = 1;
		System.out.println("enter the number 4<n<16");		
		
		while (true) {	
				
			numb = sc.nextInt();
			
			if (numb>4 & numb<16) {
				
				sc.close();
				
				for(int i=1; i<=numb; i++) {
					fact = fact * i;
				}
				
				break;
				
			} else {
				System.out.println("invalid number, please enter correct number");	
				continue;
			}
				
		}
		
	System.out.println("the factorial of a " + numb + " is " + fact);	
		
	}

}
