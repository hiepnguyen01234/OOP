package tuan3;

import java.io.*;

import java.util.Scanner ;

class SoLo{
	int mssv;
	String name ;
}

public class Class1 {
	public static void main(String[]args) throws IOException {
		SoLo[] student=new SoLo[3];
		student[0]=new SoLo() ;
		student[0].mssv=20152015 ;
		student[0].name="nguyen van teo" ;
		System.out.println("mssv la: "+student[0].mssv+" ; ho ten sinh vien la: " +student[0].name);
	}

}
