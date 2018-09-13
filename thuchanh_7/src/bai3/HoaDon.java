package bai3;

import java.util.Scanner;
import java.util.Calendar;

public class HoaDon {
	protected int maHD;
	protected Calendar ngayHD;
	protected String name;
	protected int maPhong;
	protected Double donGia;
	
	public void setMaHD(int mhd) {
		maHD =mhd;
	}
	public void setNgayHD(Calendar nhd) {
		ngayHD =nhd;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setMaPhong(int mp) {
		maPhong =mp;
	}
	public void setDonGia(Double dg) {
		donGia =dg;
	}
	public int getMaHD() {
		return maHD;
	}
	public Calendar getNgayHD() {
		return ngayHD;
	}
	public String getName() {
		return name;
	}
	public int getMaPhong() {
		return maPhong;
	}
	public Double getDonGia() {
		return donGia;
	}

}
