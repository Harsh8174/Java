package Programs;

public class P09_Constructor {
      P09_Constructor(){
    	  System.out.println("0 arg constructor");
      }
      P09_Constructor(int a){
    	  System.out.println("1 arg constructor");
      }
      P09_Constructor(int a,int b){
    	  System.out.println("2 arg constructor");
      }
      P09_Constructor(int a,float b){
    	  System.out.println("2 arg constructor with different type of arg");
      }
      P09_Constructor(float b,int a){
    	  System.out.println("2 arg constructor with change in order of arg");
      }
      P09_Constructor(P09_Constructor obj){
    	  System.out.println("copy constructor as overloading ");
      }
      public static void main(String[] args) {
		P09_Constructor c1=new P09_Constructor();
		P09_Constructor c2=new P09_Constructor(23);
		P09_Constructor c3=new P09_Constructor(24,25);
		P09_Constructor c4=new P09_Constructor(12,24f);
		P09_Constructor c5=new P09_Constructor(24f,12);
		P09_Constructor c6=new P09_Constructor(c5);
      }
}
