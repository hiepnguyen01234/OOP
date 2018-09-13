package com.test;
import com.bean.Complex;

public class TestComplex {
	public static void main(String args[]) {
		Complex obj1 = new Complex();
		obj1.inSoPhuc();
		Complex obj2 = new Complex(1.1,2.2);
		obj2.inSoPhuc();
		Complex obj3 = new Complex();
		obj3.nhapSoPhuc();
		obj3.inSoPhuc();
		obj1.congHaiSoPhuc(obj2, obj3);
		obj1.inSoPhuc();
	}

}
