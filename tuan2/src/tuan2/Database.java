package tuan2;

import java.io.*;  

import java.util.Scanner ;

public class Database {
public static void  main (String[] args) {
	//SHOW DATABASES ;
	Scanner inputdata=new Scanner(System.in) ;
	System.out.print("enter name:");
	String a= inputdata.nextLine() ; //kieu:nextLine() de nhap ca dau cach
										/*Một số phương thức:
											- next() //dùng cho String
											- nextInt()
											- nextFloat()
											- nextBoolean()
											- nextByte()
											- nextLine()*/
	System.out.println("your name is : " +a) ;
}
}

//phuong thuc :JOptionpane (nhap xuat du lieu tren mot box)
/*import javax.swing.JOptionPane;
public class Database
{
      public static void main(String[] args)
      {
            String name = "";
            name=JOptionPane.showInputDialog("Please enter your name");
            String msg = "Hello " + name + "!";
            JOptionPane.showMessageDialog(null, msg);  //Một số phương thức của JOptionPane:
														//	- showConfirmDialog() : Hiển thị một câu hỏi lựa chọn giống như yes no cancel
														//	- showInputDialog() : Hiển thị box nhập
														//	- showMessageDialog() : Báo cho người dùng một sự kiện vừa xảy ra.

            System.out.println("Name is:"+msg);
      }

}*/