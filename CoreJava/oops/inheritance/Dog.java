package corejava.oops.inheritance;

public class Dog extends Animal{
    int x=4;
    public void speak()
    {
        System.out.println(super.x);
        System.out.println("Super class color value is : "+super.color);
        System.out.println("This is current class value of the x is : "+  this.x);
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eating();
        System.out.println(dog.color);
        dog.speak();
    }
}
