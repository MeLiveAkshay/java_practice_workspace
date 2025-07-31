package mutli__thread;

public class SharedResource {
    private int number;
    private boolean status=false;


    public synchronized int getNumber() throws InterruptedException {
        if(status ==false){
            wait();
        }
        System.out.println("Got : "+number);
        status=false;
        notify();
        return number;
    }

    synchronized public void setNumber(int number) throws InterruptedException {
        if(status==true){
            wait();
        }
        this.number = number;
        System.out.println("Set : "+number);
        status=true;
        notify();
    }

    
}
