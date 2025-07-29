package mutli__thread;

public class MyRunnableMain {
    public static void main(String[] args) {
        
        MyRunnableThread thread=new MyRunnableThread();
        Thread thread1=new Thread(thread);
        thread1.setName("MyRunnableThread-1");
        thread1.start();



        Thread thread2=new Thread(thread, "MyRunnableThread-2");
        Thread threadName=Thread.currentThread();
        thread2.start();
        for(int i=1;i<=10;i++){
            System.out.println(threadName.getName()+" : "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of the Application !!!!");
    }

}
