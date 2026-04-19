package Programs;

class ABC {
	ABC(){
		System.out.println("0-ARG Constructor");
	}
	ABC(int i){
		System.out.println("1-ARG Constructor");
	}
	ABC(int i,int v){
		System.out.println("2-ARG Constructor");
	}
}


public class P18_ConstructorOverloading {
   public static void main(String[] args) {
    System.out.println("Program Dmeostrating concept of constructor overloading");
	   ABC obj=new ABC();
	   ABC obj1=new ABC(45);
	   ABC obj2=new ABC(33);
	   
	
}
}
