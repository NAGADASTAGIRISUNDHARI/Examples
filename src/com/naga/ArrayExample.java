package com.naga;

public class ArrayExample {

	public static void main(String [] args)
	{
		System.out.println("Welcome");
		
		int [] arr= {33,44,55,33};
		
		
		System.out.println("arraylength==>"+arr.length);
		System.out.println(arr[0]);
		
		for (int i: arr)
		{
			System.out.println("Chinna==>"+i);
		}
	}
}
