package thuchanh_1;

public class TestRun {
	public static void main(String args[]) {
		BankAccount acc1 = new BankAccount("Nguyen Thien Thuat",15);
		BankAccount acc2 = new BankAccount("Bui Hanh Kiem",17);
		acc1.display();
		acc2.display();
	}

}
