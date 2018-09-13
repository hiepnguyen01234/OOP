package bai4;

import java.util.Scanner;

import java.util.Calendar;

public class KhachHang {
	protected int maKH;
	protected String name;
	protected Calendar ngayTN;
	protected int soLuong;
	protected int donGia;
	
	Scanner in =new Scanner(System.in);
	
	public void setMaKH(int mkh) {
		maKH =mkh;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setNgayTN(Calendar ntn) {
		ngayTN =ntn;
	}
	public void setSoLuong(int sl) {
		soLuong =sl;
	}
	public void setDonGia(int dg) {
		donGia =dg;
	}
	public int getMaKH() {
		return maKH;
	}
	public String getName() {
		return name;
	}
	public Calendar getNgayTN() {
		return ngayTN;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public int getDonGia() {
		return donGia;
	}
	
	public void nhap() {
		System.out.println("nhap ma khach hang: ");
		maKH =in.nextInt();
		System.out.println("nhap ten khach hang: ");
		name =in.nextLine();
		System.out.println("nhap so luong: ");
		soLuong =in.nextInt();
	}
	
	public KhachHang(int mkh,String name,Calendar ntn,int sl,int dg) {
		setMaKH(mkh);
		setName(name);
		setNgayTN(ntn);
		setSoLuong(sl);
		setDonGia(dg);
	}
	
	public String toString() {
		return ("ma khach hang: "+maKH+"name: "+name+"ngay: "+ngayTN.getTime()+"so luong: "+soLuong+"don gia:" +donGia);
	}

}
