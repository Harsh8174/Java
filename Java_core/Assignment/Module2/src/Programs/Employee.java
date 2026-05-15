package Programs;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
   private String name;
   private String email;
   private String Gender;
   private LocalDate Data_of_Birth;
   private double salary;
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getEmail() {
	return email;
   }
   public void setEmail(String email) {
	this.email = email;
   }
   public String getGender() {
	return Gender;
   }
   public void setGender(String gender) {
	Gender = gender;
   }
   public LocalDate getData_of_Birth() {
	return Data_of_Birth;
   }
   public void setData_of_Birth(LocalDate data_of_Birth) {
	Data_of_Birth = data_of_Birth;
   }
   public double getSalary() {
	return salary;
   }
   public void setSalary(double salary) {
	this.salary = salary;
   }
   @Override
   public String toString() {
	return "Employee [name=" + name + ", email=" + email + ", Gender=" + Gender + ", Data_of_Birth=" + Data_of_Birth
			+ ", salary=" + salary + "]";
   }
   
}
