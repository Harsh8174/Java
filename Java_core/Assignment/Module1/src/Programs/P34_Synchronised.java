package Programs;
class myPerson extends Thread{
	String name;
	myPerson(String name){
		this.name=name;
	}
	synchronized public void run() {
		System.out.println(Thread.currentThread().getName() + " START");
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hnadled");
		}
		System.out.println(Thread.currentThread().getName() + " END");
	}
	
}
public class P34_Synchronised {
    public static void main(String[] args) {
		myPerson p1=new myPerson("Andrew Anderson");
		
		Thread t1=new Thread(p1);
		Thread t2=new Thread(p1);
		Thread t3=new Thread(p1);
		    
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
