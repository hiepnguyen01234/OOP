package tuan2;

import java.io.*; //thu vien nhap xuat
import java.util.Scanner; //thu vien ho tro nhap du lieu

public class SwitchCase {
public static void main(String[]args) throws IOException //bo loi nhap xuat 
{
	Scanner inputData =new Scanner(System.in); //vung dem
	for(int i=1;i<=3;i++) {
	    System.out.print("enter number:");
		int number =inputData.nextInt(); //lay gia tri tu vung dem
		switch (number) {
		case 9 :
		case 5 :
		case 1 :System.out.println("one,five,nine");
		        break;
		case 4 :
		case 6 :
		case 2 :System.out.println("two,four,six");
		        break;
		case 3 :System.out.println("three");
		        break;
		default : System.out.println("i don't know");
		}
	}
}
}
