package com.test;
import com.utils.MyDate;

public class TestMyDate {
	public static void main(String args[]) {
		MyDate ojb1 = new MyDate();
		ojb1.hienThi();
		MyDate ojb2 = new MyDate(12,12,2007);
		ojb2.hienThi();
		MyDate ojb3 = new MyDate();
		ojb3.nhap();
		ojb3.hienThi();
	}

}
