package doubt;

class PrivateConstructor
{

    PrivateConstructor()
    {
        System.out.println("Yes ,This is ptivate constructor");
    }
    
}

public class MainClass
{
    public static void main(String[] args) 
    {
        PrivateConstructor constructor=new PrivateConstructor();
    }
}
