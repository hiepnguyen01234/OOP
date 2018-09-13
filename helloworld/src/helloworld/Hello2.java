package helloworld;

import java.io.* ; //thu vien nhap xuat

public class Hello2 {
public static void main (String []args ) throws IOException //loai tru loi trong nhap xuat du lieu
{
	String inputData; //khai bao vung dem kieu xau
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); //tao vung dem
	System.out.print("enter:");
	inputData =br.readLine(); //nhap du lieu
	int number1 =Integer.parseInt(inputData); //lay du lieu tu vung dem
	System.out.println("number :"+(number1+2));
    System.out.println("do la cach mot");	
	}
}
