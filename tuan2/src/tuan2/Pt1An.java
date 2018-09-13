package tuan2;

import java.io.*;

import java.util.Scanner ;

public class Pt1An {
public static void main(String[]args) throws IOException 
{
	Scanner inputData =new Scanner(System.in);
	System.out.print("enter a:");
	int a= inputData.nextInt();
	System.out.print("enter b:");
	int b= inputData.nextInt();
	System.out.println("gia tri x la:" +(double)((-b)/a));
	
	/*for(int i=0;i<3;i++)
	{
		System.out.println("hello world .");
	}*/
}
}
