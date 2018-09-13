package com.test;

import com.bean.*;

public class TestPoint {
	public static void main(String args[]) {
		Point obj1 = new Point();
		obj1.hienThi();
		Point obj2 = new Point(-12.8, 15.0);
		obj2.hienThi();
		Point obj3 = new Point("B",3.5,4.5);
		obj3.hienThi();
		Point obj4 = new Point();
		obj4.nhap();
		obj4.hienThi();
	}

}
