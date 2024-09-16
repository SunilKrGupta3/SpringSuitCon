package com.springgit.in;

import java.util.Scanner;

public class PR1 {

	 public static long factorial(int num){
		    int fact=1;
		    int i=1;
		    while(i<=num) {
		        fact = fact * i;
		        i++;
		    }
		        return fact;
		    }

		    public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.print("Enter N number: ");
		        int num=sc.nextInt();
		           long fact=factorial(num);
		        System.out.println(fact);
		System.out.println("Hello");
		

	}

}
