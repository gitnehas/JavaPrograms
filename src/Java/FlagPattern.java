package com.example;

import java.util.Iterator;

public class FlagPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++)
		{
			//1st triangle
			for (int j = 1; j <=4-i; j++) 
			{
				System.out.print("*");
			}
			
			//1st space triangle
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(" ");
			}
			
			//2nd space triangle
			for (int l = 1; l <= i; l++) 
			{
				System.out.print(" ");
			}
			
			//2nd triangle
			for (int m = 1; m <=4-i; m++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
