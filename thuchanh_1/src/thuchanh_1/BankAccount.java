package thuchanh_1;

//import java.io.*;

public class BankAccount {
	private String name;
	private long balance;
	public BankAccount(String n, long b){
		setName(n);
		setBalance(b);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setBalance(long balance){
		this.balance = balance;
	}
	public void display() {
		System.out.println("ten tai khoan:"+name);
		System.out.println("so du tai khoan:"+balance);
	}

}
