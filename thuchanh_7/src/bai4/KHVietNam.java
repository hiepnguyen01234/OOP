package bai4;

public class KHVietNam extends KhachHang{
	private int doiTuong;
	private int dinhMuc;
	
	public void setDoiTuong(int dt) {
		doiTuong =dt;
	}
	public void setDinhMuc(int dm) {
		dinhMuc =dm;
	}
	public int getDoiTuong() {
		return doiTuong;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	
	public KHVietNam() {
		super(1,1,1,1,1);
	}

}
