package tuan6;

import javax.swing.JOptionPane;

public class Address {
	private String city;
	private String street;
	private int doorNo;
	
	public Address(int d,String  s,String c) {
		setDoorNo(d);
		setStreet(s);
		setCity(c);
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city =city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street =street;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo =doorNo;
	}
	public void aDisplay() {
		System.out.println("thanh pho: "+city+" ,duong : "+street+" ,so nha: "+doorNo);
	}
	public void aFix() {
		String strDoorNo,strStreet,strCity;
		int iDoorNo;
		
		strDoorNo =JOptionPane.showInputDialog(null,"nhap so nha :",JOptionPane.INFORMATION_MESSAGE);
		iDoorNo =Integer.parseInt(strDoorNo);
		setDoorNo(iDoorNo);
		
		strStreet =JOptionPane.showInputDialog(null,"ten duong :",JOptionPane.INFORMATION_MESSAGE);
		setStreet(strStreet);
		
		strCity =JOptionPane.showInputDialog(null,"ten thanh pho:",JOptionPane.INFORMATION_MESSAGE);
		setCity(strCity);
	}

}
