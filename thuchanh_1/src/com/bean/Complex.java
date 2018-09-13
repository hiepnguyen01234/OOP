package com.bean;
import javax.swing.JOptionPane;

public class Complex {
	private Double phanThuc;
	private Double phanAo;
	
	public Complex() {
		setPhanThuc(0.0);
		setPhanAo(0.0);
	}
	public Complex(Double pThuc, Double pAo) {
		setPhanThuc(pThuc);
		setPhanAo(pAo);
	}
	public void setPhanThuc(Double pThuc) {
		phanThuc = pThuc;
	}
	public void setPhanAo(Double pAo) {
		phanAo = pAo;
	}
	public Double getPhanThuc() {
		return phanThuc;
	}
	public Double getPhanAo() {
		return phanAo;
	}
	public void nhapSoPhuc() {
		String strPThuc,strPAo;
		Double dbPhanThuc,dbPhanAo;
		strPThuc = JOptionPane.showInputDialog(null,"nhap phan thuc:",JOptionPane.INFORMATION_MESSAGE);
		dbPhanThuc = Double.parseDouble(strPThuc);
		setPhanThuc(dbPhanThuc);
		strPAo = JOptionPane.showInputDialog(null,"nhap phan ao:",JOptionPane.INFORMATION_MESSAGE);
		dbPhanAo = Double.parseDouble(strPAo);
		setPhanAo(dbPhanAo);
	}
	public Complex congHaiSoPhuc(Complex cmp1,Complex cmp2) {
		phanThuc = cmp1.phanThuc+cmp2.phanThuc;
		phanAo = cmp1.phanAo+cmp2.phanAo;
		return this;
	}
	public Complex truHaiSoPhuc(Complex cmp1,Complex cmp2) {
		phanThuc = cmp1.phanThuc-cmp2.phanThuc;
		phanAo = cmp1.phanAo-cmp2.phanAo;
		return this;
	}
	public Complex nhanHaiSoPhuc(Complex cmp1,Complex cmp2) {
		phanThuc = (cmp1.phanThuc*cmp2.phanThuc)-(cmp1.phanAo*cmp2.phanAo);
		phanAo = (cmp1.phanThuc*cmp2.phanAo)+(cmp1.phanAo*cmp2.phanThuc);
		return this;
	}
	public Complex chiaHaiSoPhuc(Complex cmp1,Complex cmp2) {
		Double mau=(cmp2.phanThuc*cmp2.phanThuc)+(cmp2.phanAo*cmp2.phanAo);
		phanThuc = ((cmp1.phanThuc*cmp2.phanThuc)+(cmp1.phanAo*cmp2.phanAo))/mau;
		phanAo = ((cmp2.phanThuc*cmp1.phanAo)-(cmp1.phanThuc*cmp2.phanAo))/mau;
		return this;
	}
	public void inSoPhuc() {
		JOptionPane.showMessageDialog(null, "so phuc:"+getPhanThuc()+"+"+getPhanAo()+"i");
	}
}
