package thuchanh5;
import java.util.*;

public class ChuanHoaXau {
	public static String chuyenInHoa(String inputStr) {
		String s,outputStr ="";
		s =inputStr.substring(0,1);
		outputStr =inputStr.replaceFirst(s, s.toUpperCase());
		return(outputStr);
	}
	public static String chuanHoa(String inputStr) {
		String outputStr ="";
		StringTokenizer strToken =new StringTokenizer(inputStr," ,\t");
		outputStr +="" +chuyenInHoa(strToken.nextToken());
		while(strToken.hasMoreTokens()) {
			outputStr +=" " +chuyenInHoa(strToken.nextToken());
		}
		return (outputStr);
	}
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("nhap xau :");
		String str =input.nextLine();
		System.out.println("chuan hoa xau :"+chuanHoa(str));
	}

}
