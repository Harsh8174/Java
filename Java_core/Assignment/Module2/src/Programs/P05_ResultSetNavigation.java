package Programs;
import java.sql.*;
public class P05_ResultSetNavigation {
	

	

	    public static void main(String[] args) {

	        try {

	            // Load Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Create Connection
	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/students",
	                    "root",
	                    "root");

	            // Create Statement
	            Statement st = con.createStatement(
	                    ResultSet.TYPE_SCROLL_INSENSITIVE,
	                    ResultSet.CONCUR_READ_ONLY);

	            // Execute SELECT Query
	            ResultSet rs = st.executeQuery("SELECT * FROM student");

	            // Move to first record
	            if(rs.first()) {
	                System.out.println("First Record");
	                System.out.println(rs.getInt(1) + " "
	                        + rs.getString(2));
	            }

	            // Move to next record
	            if(rs.next()) {
	                System.out.println("\nNext Record");
	                System.out.println(rs.getInt(1) + " "
	                        + rs.getString(2));
	            }

	            // Move to last record
	            if(rs.last()) {
	                System.out.println("\nLast Record");
	                System.out.println(rs.getInt(1) + " "
	                        + rs.getString(2));
	            }

	            // Move to previous record
	            if(rs.previous()) {
	                System.out.println("\nPrevious Record");
	                System.out.println(rs.getInt(1) + " "
	                        + rs.getString(2));
	            }

	            // Close resources
	            rs.close();
	            st.close();
	            con.close();

	        } catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	}

