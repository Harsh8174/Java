package Programs;

public class P12_Methodoverloading {
      void add(byte num1,byte num2) {
    	  System.out.println("Addition in byte :"+(num1+num2));
      }
      void add(short num1,short num2) {
    	  System.out.println("Addition in short :"+(num1+num2));
      }
      void add(int num1,int num2) {
    	  System.out.println("Addition in int :"+(num1+num2));
      }
      void add(long num1,long num2) {
    	  System.out.println("Addition in long :"+(num1+num2));
      }
      void add(float num1,float num2) {
    	  System.out.println("Addition in float :"+(num1+num2));
      }
      void add(double num1,double num2) {
    	  System.out.println("Addition in double :"+(num1+num2));
      }

    public static void main(String[] args) {
		P12_Methodoverloading obj=new P12_Methodoverloading();
		obj.add(12, 13);
	    obj.add(1l, 2l);
		obj.add(12.3333f, 12.556664f);
        obj.add(45.233, 10.22);
        obj.add(4, 5)
        ;

	}

}


