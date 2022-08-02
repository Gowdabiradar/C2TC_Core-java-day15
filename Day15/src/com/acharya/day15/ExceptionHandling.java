package com.acharya.day15;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class ExceptionHandling
{
	public void checkFileNotFound()
	{
		try
		{
			FileInputStream in = new FileInputStream("input.txt");
			System.out.println("This is not printed");
		}
		catch(Exception fileNotFpundException)
		{
			System.out.println("Exception " + "Handling");
		}
	}
	public static void main(String[]args)
	{
		ExceptionHandling example = new ExceptionHandling();
		example.checkFileNotFound();
		
		}
	}
