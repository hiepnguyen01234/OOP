package tuan2;


public class Test {
	public void method2(int a) {
		a =a+1;
	}
	public void method1() {
		int a=0;
		System.out.println(a);
		method2(a);
		System.out.println("gia tri moi:"+a);
	}
	public Test() {
		
	}

}