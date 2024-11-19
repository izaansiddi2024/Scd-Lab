class Printer {
    private int pagesAvailable = 10;

    // Method to print pages
    public synchronized void printPages(int pagesToPrint) {
        System.out.println("Print request received for " + pagesToPrint + " pages.");
        while (pagesToPrint > pagesAvailable) {
            System.out.println("Not enough pages available. Waiting for refill...");
            try {
                wait(); // Wait until pages are refilled
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Pages are now available for printing
        pagesAvailable -= pagesToPrint;
        System.out.println("Printed " + pagesToPrint + " pages. Remaining pages: " + pagesAvailable);
    }

    // Method to refill pages
    public synchronized void refillPages(int pagesToAdd) {
        System.out.println("Refilling " + pagesToAdd + " pages...");
        pagesAvailable += pagesToAdd;
        System.out.println("Refill complete. Total pages available: " + pagesAvailable);
        notify(); // Notify waiting threads
    }
}

class PrintThread extends Thread {
    private Printer printer;
    private int pagesToPrint;

    public PrintThread(Printer printer, int pagesToPrint) {
        this.printer = printer;
        this.pagesToPrint = pagesToPrint;
    }

    @Override
    public void run() {
        printer.printPages(pagesToPrint);
    }
}

class RefillThread extends Thread {
    private Printer printer;
    private int pagesToAdd;

    public RefillThread(Printer printer, int pagesToAdd) {
        this.printer = printer;
        this.pagesToAdd = pagesToAdd;
    }

    @Override
    public void run() {
        printer.refillPages(pagesToAdd);
    }
}

public class PrinterJob {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Create threads
        PrintThread printJob = new PrintThread(printer, 15); // Request to print 15 pages
        RefillThread refillJob = new RefillThread(printer, 10); // Refill 10 pages

        // Start threads
        printJob.start();
        try {
            Thread.sleep(1000); // Simulate delay before refilling
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        refillJob.start();
    }
}
