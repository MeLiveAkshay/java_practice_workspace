package mutli__thread;

public class Printer {

    public void print(String msg) throws InterruptedException
    {
        System.out.println(" [ "+ msg);
        Thread.sleep(1000);
        System.out.println(" ] ");
    }

}
