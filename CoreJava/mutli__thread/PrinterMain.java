package mutli__thread;

public class PrinterMain {
   
    public static void main(String[] args) {

        //create object
        Printer printer=new Printer();

        //create object of the Printer
        PrinterThread printerThread1=new PrinterThread("Hi", printer);
        PrinterThread printerThread2=new PrinterThread("Hello", printer);
        PrinterThread printerThread3=new PrinterThread("Welcome", printer);

        //Thread of the object
        Thread thread1=new Thread(printerThread1);
        Thread thread2=new Thread(printerThread2);
        Thread thread3=new Thread(printerThread3);

        //run the program 
        thread1.start();
        thread2.start();
        thread3.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        System.out.println("End of the Application");
        
    }
}
