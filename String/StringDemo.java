package String;

public class StringDemo {
    public static void main(String[] args) {
        String name=new String("Akshay");
        String upName= name.toUpperCase();
        System.out.println(upName);//AKSHAY

        System.out.println(upName.length());//6
        System.out.println(upName.toLowerCase());//akshay
        System.out.println(upName.charAt(2));//h;
    }
    
}
