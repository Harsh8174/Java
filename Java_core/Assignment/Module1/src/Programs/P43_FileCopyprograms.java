package Programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P43_FileCopyprograms {
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
		FileOutputStream fro=new FileOutputStream("Datacopyedfile.txt");
		 byte btr[]= str.getBytes();
		 fro.write(btr);
		 fro.flush();
		 fro.close();
	}
public static void main(String[] args)  {
	 P43_FileCopyprograms obj=new P43_FileCopyprograms();
	try {
		String readresult= obj.Filereader();
		obj.Filewrite(readresult);
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exeception handled");
	}
}
}
