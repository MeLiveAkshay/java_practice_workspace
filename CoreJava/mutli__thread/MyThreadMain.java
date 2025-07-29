package mutli__thread;

public class MyThreadMain {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.setName("myThread - 01");
        myThread.start();
    }
}
