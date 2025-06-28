package com.example.utils;

public class Utilities {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int n)
	{
		return (n%2==0);
	}
}