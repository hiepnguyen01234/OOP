package tuan3;

import tuan3.SinhVien; 

public class Test {
	public static void main(String[]args) {
		SinhVien[] student =new SinhVien[5] ;
		System.out.print("nhap mssv:");		
		student[0]=new SinhVien() ;		//chu y:can cap phat cho cac phan tu .
		student[0].setmssv();
		System.out.print("nhap ten sinh vien:");
		student[0].setname();
		System.out.println("ma so sinh vien: "+student[0].getmssv()+"; ho ten sinh vien:"+student[0].getname());
		System.out.println("hello world .");
	}

}
/*
truong hop ngoai le la voi cac kieu nguyen thuy (con nhung kieu moi can cap phat heap )
vd: (truong hop nay chay duoc)
  int[] mssv =new int[3] ;
  mssv[2]=123 ;   
*/