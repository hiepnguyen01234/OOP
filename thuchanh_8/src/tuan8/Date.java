package tuan8;

public class Date {
	public int ngay;
	public int thang;
	public int nam;
	
	public void setNgay(int ng) {
		ngay =ng;
	}
	public void setThang(int t) {
		thang =t;
	}
	public void setNam(int n) {
		nam =n;
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
	
	public Date(int ng,int t,int n) {
		setNgay(ng);
		setThang(t);
		setNam(n);
	}
	public void hienthi() {
		System.out.println("ngay : "+ngay+"/ "+thang+"/ "+nam);
	}

}
