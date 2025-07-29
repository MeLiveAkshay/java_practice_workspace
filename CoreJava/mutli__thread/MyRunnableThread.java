package mutli__thread;

public class MyRunnableThread implements Runnable{

    

    @Override
    public void run()
    {
        Thread threadName=Thread.currentThread();
        for(int i=1;i<=10;i++){
            System.out.println(threadName.getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void join() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'join'");
    }
}
