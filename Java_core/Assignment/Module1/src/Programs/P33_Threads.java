package Programs;

class mythread extends Thread{
	String name;
	mythread(String name){
		this.name=name;
	}
	public void run() {
		System.out.println(name + "running");
	}
}

public class P33_Threads {
    public static void main(String[] args) {
		mythread t1=new mythread("mythread 1");
		mythread t2=new mythread("mythread 2");
		mythread t3=new mythread("mythread 3");
		mythread t4=new mythread("mythread 4");
		mythread t5=new mythread("mythread 5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
