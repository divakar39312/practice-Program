package com.Bridgelabz;

public class ArmstrongNu {

public static void main(String[] args) {
		
		int n=153;
		int temp=n;
		int r,sum=0;
		
		while(n>0) {
		   r=n % 10;
		   n=n/10;
		   sum=sum + r*r*r;
	     }        
		
		if(temp == sum) 
			System.out.println("its armstrong number");
		else
			System.out.println("not armstrong number");
	}

}
