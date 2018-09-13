package tuan3;

import java.io.* ;

import java.util.Scanner ;

import tuan3.SinhVien ;

public class SuDungLop {
	public static void main(String[]agrs) throws IOException 
	{
	SinhVien[] student =new SinhVien[3] ;
	for (int i=0 ;i<3;i++)
	{
		student[i]=new SinhVien(); //khi su dung bat buoc phai khai bao :heap
		System.out.print("enter mssv "+i+":");
		student[i].setmssv() ;
		System.out.print("enter name "+i+":");
		student[i].setname();
	}
	for(int i=0;i<3;i++)
	{
	System.out.println("mssv:" +student[i].getmssv()+" ; ho va ten sinh vien:"+student[i].getname());
	}
	}

}
