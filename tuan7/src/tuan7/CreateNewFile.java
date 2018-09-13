package tuan7;

import java.io.* ;

public class CreateNewFile {
	public static void main(String[]args) throws IOException {
		try {
			File file=new File("D:/myfile.txt");
			if(file.createNewFile())
				System.out.println("succesfull .");
			else {
				System.out.println("this file can be create or it had been created .");		
			}
			
		
			FileWriter wr=new FileWriter("D:/myfile.txt");
			FileReader rd=new FileReader("D:/myfile.txt");
			for(int i=0 ;i<3;i++) {
				wr.write(String.valueOf(1));
				wr.write(" : nguyen van teo"+i+" : ");
				wr.write(String.valueOf(9.5));
				char ch ;
				while ((ch=(char) rd.read()) != -1)
					System.out.println(ch);
				wr.close();
				rd.close();
			}
		}
		catch (FileNotFoundException e){
			System.out.println(e.getMessage()) ;			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
