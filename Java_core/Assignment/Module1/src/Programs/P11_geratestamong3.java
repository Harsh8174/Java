package Programs;
import java.util.Scanner;
public class P11_geratestamong3 {

	void greatest(int num1,int num2 ,int num3) {
		
		if(num1>num2 && num1>num3) {
			System.out.println("Num1 is greates");
		}
		else if(num2>num3){
			   System.out.println("Num2 is greatest");
		}else {
			  System.out.println("Num3 is greatest");
		}
		
	}
	
	
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fisrt number");
        int num1=sc.nextInt();
        System.out.println("Enter Second number");
        int num2=sc.nextInt();
        System.out.println("Enter third number");
        int num3=sc.nextInt();
        P11_geratestamong3 obj=new P11_geratestamong3();
        obj.greatest(num1,num2,num3);
        
}
}
