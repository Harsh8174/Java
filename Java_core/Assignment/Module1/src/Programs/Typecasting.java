package Programs;


	public class Typecasting {
		public static void main(String[] args) {
			//implicit typecasting automatically done by compiler
			//small size data type to big data type implicit typecasting
			
			byte a= 1;
			int b=a;//implicit a converted from byte to int
			System.out.println(b);
			double c=b;//int to double implicit
			System.out.println(c);
			
			//Explicit typecasting not automatically done by compiler
			//big size data type to small size data type implicit typecasting

		    int d = (int)c;//double to int
		    System.out.println(d);
		    float e= (int)d;//int to float
		    System.out.println(e);
		    }
		}


