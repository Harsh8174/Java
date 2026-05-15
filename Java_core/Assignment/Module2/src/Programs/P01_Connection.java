package Programs;

import java.sql.Connection;
import java.sql.DriverManager;

public class P01_Connection {
        public static void main(String[] args) {
			//load the driver
        	try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	}
        	catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
        	  }
        	//Connection establish
        	try {
        	String url = "jdbc:mysql://localhost:3306/userdata";
        	String name = "root";
        	String password = "Pitambra@8174";
        	Connection con=DriverManager.getConnection(url, name, password);
        	System.out.println("Database connected Successfully");
        	con.close();
        	}
        	catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
        	}
        	}
}
