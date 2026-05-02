package Programs;
class SharedResource {
    private int data;
    private boolean hasData = false;

    // Producer method
    synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        data = value;
        System.out.println("Produced: " + data);
        hasData = true;

        notify(); 
    }

    // Consumer method
    synchronized void consume() {
        while (!hasData) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); 
    }
}

// Producer Thread
class Producer extends Thread {
    SharedResource obj;

    Producer(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            obj.produce(i);
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    SharedResource obj;

    Consumer(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            obj.consume();
        }
    }
}



public class P35_Intrathread {
	public static void main(String[] args) {

        SharedResource obj = new SharedResource();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
}
}