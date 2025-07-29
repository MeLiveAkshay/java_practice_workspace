package mutli__thread;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnableThread thread=new MyRunnableThread();
        Thread thread1=new Thread(thread);
        thread1.start();
    }

}
