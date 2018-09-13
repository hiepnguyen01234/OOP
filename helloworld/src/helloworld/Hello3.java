package helloworld;

import java.io.* ; //can them thu vien nay

import java.util.Scanner ; //thu vien nhap xuat tien loi

public class Hello3 {
public static void main(String[]args) throws IOException //loai tru nhung loi nhap xuat
{
	//String inputData; cai nay khong can kha bao giong cach 1
	Scanner inputData = new Scanner(System.in); //khai bao vung dem
	System.out.print("enter:");
	int number1=inputData.nextInt(); //cho bien lay gia tri vung dem
	System.out.println("number:"+(number1+5));
	System.out.println("day la cach 2.");
	
	//thu xem co dung cu phap a=a+1 duoc khong => duoc.
	number1=number1+1;
	System.out.println("number :"+number1);
	}
}
