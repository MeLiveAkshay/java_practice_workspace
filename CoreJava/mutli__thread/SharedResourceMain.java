package mutli__thread;

public class SharedResourceMain {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();

        SetterThread setter=new SetterThread(resource);
        GetterThread getter=new GetterThread(resource);


        Thread setterThread=new Thread(setter);
        Thread getterThread=new Thread(getter);


        setterThread.start();
        getterThread.start();

        try{
            setterThread.join();
            getterThread.join();
        }
        catch(InterruptedException exception){
            exception.printStackTrace();
        }

        System.out.println("End of The Application");
    }

}
