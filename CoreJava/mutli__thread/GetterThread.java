package mutli__thread;

public class GetterThread implements Runnable {


    private SharedResource resource;


    public GetterThread(SharedResource resource)
    {
        super();
        this.resource=resource;
    }

    @Override
    public void run() {
        for(int i=0;i<11;i++){
            try {
                resource.getNumber();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    
}
