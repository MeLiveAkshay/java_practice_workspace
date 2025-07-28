package corejava.oops.method_overriding;

public class MethodOverridingExample
{
    public static void main(String[] args)
    {
        Animal animal = new  Dog();
        animal.sound();//dog bark
        Animal animal2=new Cat();
        animal2.sound();;//cat meow 
    }
}
