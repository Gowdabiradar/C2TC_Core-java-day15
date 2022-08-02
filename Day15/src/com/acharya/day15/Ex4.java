package com.acharya.day15;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("D:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();// TODO Auto-generated method stub
		}

	}

