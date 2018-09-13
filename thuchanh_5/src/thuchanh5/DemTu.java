package thuchanh5;
import java.util.*;

public class DemTu {
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("nhap xau :");
		String str =input.nextLine();
		StringTokenizer strToken =new StringTokenizer(str," ");
		System.out.println("do dai xau ky tu vua nhap: "+strToken.countTokens());
	}
}
