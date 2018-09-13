package tuan3;

import java.io.* ;

import java.util.Scanner ;

public class SinhVien {
private static int mssv ;
private static String name ;

public void setmssv ()
{
	Scanner inputData=new Scanner(System.in);
	//System.out.print("enter name :");
	mssv=inputData.nextInt() ;
}
public int getmssv()
{
	return mssv;
}
public void setname()
{
	Scanner inputData=new Scanner (System.in) ;
	//System.out.print("enter name :");
	name =inputData.nextLine() ;
	//inputData.close();
	}
public String getname() 
{
	return name ;
}
}
