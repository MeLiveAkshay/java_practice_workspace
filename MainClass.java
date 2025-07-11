public class MainClass {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // First command-line argument as int
        System.out.println("First Number: " + a);

        String name = args[1]; // Second command-line argument as String
        System.out.println("Name: " + name);
    }
}
