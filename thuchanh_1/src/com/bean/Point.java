package com.bean;

import javax.swing.JOptionPane;

public class Point {
	private String tenDiem;
	private Double tungDo;
	private Double hoanhDo;
	
	public Point() {
		setTenDiem("A");
		setTungDo(0.0);
		setHoanhDo(0.0);
	}
	public Point(Double tung,Double hoanh) {
		setTenDiem("noname");
		setTungDo(tung);
		setHoanhDo(hoanh);
	}
	public Point(String ten,Double tung,Double hoanh) {
		setTenDiem(ten);
		setTungDo(tung);
		setHoanhDo(hoanh);
	}
	public void setTenDiem(String ten) {
		tenDiem = ten;
	}
	public void setTungDo(Double tung) {
		tungDo = tung;
	}
	public void setHoanhDo(Double hoanh) {
		hoanhDo = hoanh;
	}
	public String getTenDiem() {
		return tenDiem;
	}
	public Double getTungDo() {
		return tungDo;
	}
	public Double getHoanhDo() {
		return hoanhDo;
	}
	public void nhap() {
		String strTen,strTung,strHoanh;
		Double dbTung,dbHoanh;
		strTen = JOptionPane.showInputDialog(null,"ten diem:",JOptionPane.INFORMATION_MESSAGE);
		setTenDiem(strTen);
		strTung = JOptionPane.showInputDialog(null,"tung do:",JOptionPane.INFORMATION_MESSAGE);
		dbTung = Double.parseDouble(strTung);
		setTungDo(dbTung);
		strHoanh = JOptionPane.showInputDialog(null,"hoanh do:",JOptionPane.INFORMATION_MESSAGE);
		dbHoanh = Double.parseDouble(strHoanh);
		setHoanhDo(dbHoanh);
	}
	public void hienThi() {
		JOptionPane.showMessageDialog(null, "Point:"+getTenDiem()+"("+getTungDo()+","+getHoanhDo()+")");
		
	}

}
