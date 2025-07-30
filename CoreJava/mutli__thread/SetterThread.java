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
            resource.setNumber(i);
        }
    }
    
}
