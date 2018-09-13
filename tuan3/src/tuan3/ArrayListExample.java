package tuan3;

import java.util.ArrayList ; //hoac viet :java.util.* ;

public class ArrayListExample {
	   public static void main(String args[]) {
	          /*
	             Tạo object arraylist có kiểu dữ liệu đối tượng là String
	         */
		  ArrayList<String> obj = new ArrayList<>(); //hoac :ArrayList<String> obj=new ArrayList<String>();
	 
		  /*đây là cách arraylist thêm các phần thử vào mảng*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");
	 
		  /*hiển thị các danh sách  các phần tử của mảng */
		  System.out.println("Currently the array list has following elements:"+obj);
	 
		  /*Thêm phần tử ghì đè lên key đã có sẵn*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");
	 
		  /*xóa phần tử trong arraylist*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");
	 
		  System.out.println("Current array list is:"+obj);
	 
		  obj.remove(1);
	 
		  System.out.println("Current array list is:"+obj);
	   }
}
