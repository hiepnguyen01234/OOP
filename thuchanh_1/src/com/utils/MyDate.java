package com.utils;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class MyDate {
	private int ngay;
	private int thang;
	private int nam;
	
	public MyDate() {
		Calendar cal = Calendar.getInstance();
		setNgay(cal.get(Calendar.DAY_OF_MONTH));
		setThang(cal.get(Calendar.MONTH));
		setNam(cal.get(Calendar.YEAR));
	}
	public MyDate(int ng,int th,int na) {
		setNgay(ng);
		setThang(th);
		setNam(na);
	}
	public void setNgay(int ng){
		ngay = ng;
	}
	public void setThang(int th) {
		thang = th;
	}
	public void setNam(int na) {
		nam = na;
	}
	public int getNgay() {
		return ngay;
	}
	public int getThang() {
		return thang;
	}
	public int getNam() {
		return nam;
	}
	public void nhap() {
		String strNgay,strThang,strNam;
		int iNgay,iThang,iNam;
		do {
		strNgay = JOptionPane.showInputDialog(null,"ngay:",JOptionPane.INFORMATION_MESSAGE);
		iNgay = Integer.parseInt(strNgay);
		}while(iNgay<1 || iNgay>31);
		setNgay(iNgay);
		do {
			strThang = JOptionPane.showInputDialog(null,"thang:",JOptionPane.INFORMATION_MESSAGE);
			iThang = Integer.parseInt(strThang);
		}while(iThang<1 || iThang>12);
		setThang(iThang);
		do {
			strNam = JOptionPane.showInputDialog(null,"nam:",JOptionPane.INFORMATION_MESSAGE);
			iNam = Integer.parseInt(strNam);
		}while(iNam<1);
		setNam(iNam);
	}
	public void hienThi() {
		Calendar cal = Calendar.getInstance();
		cal.set(getNam(), getThang(), getNgay());
		JOptionPane.showMessageDialog(null, (cal.get(Calendar.DAY_OF_WEEK)==1 ? "chu nhat":"thu"+cal.get(Calendar.DAY_OF_WEEK))+"ngay"+getNgay()+"/"+getThang()+"/"+getNam());
	}

}
