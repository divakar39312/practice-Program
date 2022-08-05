package com.Bridgelabz;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//String str ="Hello";
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	     }
	    System.out.println(rev);
	}
}
