package com.test.design;
import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {
		 
			  int i,fact=1;  
			  Scanner sc = new Scanner(System.in);
			  int number = sc.nextInt();
			  
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 

	}

}
