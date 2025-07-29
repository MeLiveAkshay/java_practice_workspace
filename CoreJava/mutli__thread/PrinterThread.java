package mutli__thread;

public class PrinterThread implements Runnable{

    private String msg;
    private Printer printer;


    
    public PrinterThread(String msg, Printer printer) {
        this.msg = msg;
        this.printer = printer;
    }



    @Override
    public void run() {
        try {
            printer.print(msg);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }

}
