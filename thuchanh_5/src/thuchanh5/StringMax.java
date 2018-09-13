package thuchanh5;
import java.util.*;

public class StringMax {
	public static void timXauMax(String inputStr) {
		int i =1,viTriMax,maxLength,strLength;
		StringTokenizer strToken =new StringTokenizer(inputStr," ,\t");
		viTriMax =1;
		maxLength =strToken.nextToken().length();
		while(strToken.hasMoreTokens()) {
			i =i++;
			strLength =strToken.nextToken().length();
			if(strLength > maxLength) {
				viTriMax =i;
				maxLength =strLength;
			}
		}
		System.out.println("do dai xau lon nhat :"+maxLength +" o vi tri :"+viTriMax);
	}
	public static void main(String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("nhap chuoi :");
		String str =input.nextLine();
		timXauMax(str);
	}

}
