package Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P44_Filedatareader {
	String Filereader() throws IOException{
		FileInputStream fir=new FileInputStream("user1.txt");
		int i;
		String str="";
		while((i=fir.read())!=-1) {
			str += (char)i;
		}
		fir.close();
		return str;
	}
	void Filewrite(String str)throws IOException {
		FileOutputStream fro=new FileOutputStream("Contentcopyfile.txt");
		 byte btr[]= str.getBytes();
		 fro.write(btr);
		 fro.flush();
		 fro.close();
	}
	public static void main(String[] args) {
		P44_Filedatareader obj=new P44_Filedatareader();
		try {
			String str=obj.Filereader();
			obj.Filewrite(str);
		}catch (Exception e) {
			// TODO: handle exception
              System.out.println("Exeception handled");		   
		}
				
	}
}
