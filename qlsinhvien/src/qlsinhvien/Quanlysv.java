/*
1. lay link
  - cu phap: + String link = System.getProperty("user.dir");
             + in ra: System.out.println(link);            
             
2. dung linklist
  - khai bao: + LinkedList<String> name = new LinkedList<>();  (chac la linklist dang string)
  - them phan tu: + name.add(String thongtin);
  - lay kich co: + name.size();
  - lay dia chi: + name.get(int i);
   
3. dung scanner nhap du lieu
  - khai bao thu vien: + import java.io.*;
                       + import java.util.Scanner;
  - khai bao su dung: + khai bao vung dem: Scanner vungdem = new Scanner(System.in);
                      + lay du lieu: String ten = vungdem.nextLine();
                      + hien thi du lieu: System.out.println(ten);
                      
4. kiem tra string khong NULL
  - cu phap: + if(!name.isEmpty()) {
               ...
               }
               
5. ep kieu
  - cu phap: + ten = Integer.parseInteger(scanner.nextLine());         
  
6. duyet in phan tu(iterator)   
  - cu phap: + Iterator<String> tengi = name.iterator(); (trong do "name" la linklist da khai bao)
  - vi du:  + Iterator<String> tengi = danhsach.iterator();
              while (tengi.hasNext()) {
                System.out.println(tengi.next());
                }
7. cat xau
  - mang = xau.split("\t");  ( "\t": la dau tab; "\s": la dau cach )
  - vd: mang = xau.get(i).split("\t"); (i la int khai bao o tren)
  
8. so sanh  
  - xau1.equalsIgnoreCase(xau2);  (so sanh khong tinh chu hoa hay thuong)
    + hoac: xau1.equals(xau2);           
  - vd: if(serch.equals(xau)) {
        list.add(danhsach.get(i));
        }
                 
*/



package qlsinhvien;

public class Quanlysv {
	public static void main(String args[]) {
		String link =  System.getProperty("user.dir");
		System.out.println(link);
	}

}
