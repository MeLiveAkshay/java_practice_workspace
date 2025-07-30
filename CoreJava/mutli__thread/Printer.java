package mutli__thread;

public class Printer {
    //synchronization method
    public  synchronized void print(String msg) throws InterruptedException
    {
        synchronized (this){
            System.out.print(" [ "+ msg);
            Thread.sleep(1000);
            System.out.println(" ] ");
        }
    }


   

}
