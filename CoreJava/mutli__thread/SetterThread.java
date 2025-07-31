package mutli__thread;

public class SetterThread implements Runnable  {

    private SharedResource resource;


    public SetterThread(SharedResource resource)
    {
        super();
        this.resource=resource;
    }

    @Override
    public void run() {
        for(int i=0;i<11;i++){
            try {
                resource.setNumber(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
