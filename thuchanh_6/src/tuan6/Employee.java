package tuan6;

public class Employee {
	private int id;
	private String name;
	private Address address;
	
	public Employee(int i,String n,Address a) {
		setId(i);
		setName(n);
		setAddress(a);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address =address;
	}
	public void eDisplay() {
		System.out.println("ma nhan vien :"+id+" ,ten nhan vien : "+name+" ,dia chi nha ( so nha : "+address.getDoorNo()+" ,duong : "+address.getStreet()+" ,thanh pho : "+address.getCity()+" )");
	}
	public static void main(String args[]) {
		Address a =new Address(338,"ho tung mau","da nang");
		a.aFix();
		Employee e =new Employee(123,"thai duong ha san",a);
		e.eDisplay();
	}
}
