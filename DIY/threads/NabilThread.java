package DIY;

public class NabilThread extends Thread{

    @Override
    public void run() {
        System.out.println("I am before sleep thread");


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " : After sleep current thread.");
    }

    public static void main(String[] args) {

        NabilThread t1 = new NabilThread();
        t1.setName("T1-Nabs-Thread");
        t1.start();

        NabilThread t2 = new NabilThread();
        t2.setName("T2-Nabs-Thread");
        t2.start();

        Thread globalTh = new Thread(){

        	@Override
        	public void run(){
        		System.out.println("I am a thread of global.")
        	}

        };
        globalTh.start();

        System.out.println("End program test.");
    }



}
