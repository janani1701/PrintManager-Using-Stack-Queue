import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintJobManager {
    private PrintQueue printQueue = new PrintQueue();
    private PriorityPrintStack priorityStack = new PriorityPrintStack();
    private Scanner scanner;

    public PrintJobManager() {
        this.scanner = new Scanner(System.in);
    }

    public void submitPrintJob(PrintJob job) {
        if (job.getPriority() == 1) {
            printQueue.add(job);
        } else {
            priorityStack.add(job);
        }
        System.out.println("Submitted print job: " + job.getDescription());
    }

    public void processPrintJobs() {
        while (!priorityStack.hasJobs()) {
            PrintJob job = priorityStack.getNextJob();
            if (job != null) {
                System.out.println("Processing high-priority print job: " + job.getDescription());
                simulatePrinting();
            }
        }

        while (!printQueue.hasJobs()) {
            PrintJob job = printQueue.getNextJob();
            if (job != null) {
                System.out.println("Processing regular print job: " + job.getDescription());
                simulatePrinting();
            }
        }
    }

    public void closeScanner() {
        scanner.close();
    }

    private static void simulatePrinting() {
        // Simulate printing by adding a delay
        try {
            Thread.sleep(1000); // 1-second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void printAllJobs(List<PrintJob> printJobs) {
        List<PrintJob> highPriorityJobs = new ArrayList<>();
        List<PrintJob> regularPriorityJobs = new ArrayList<>();

        for (PrintJob job : printJobs) {
            if (job.getPriority() == 1) {
                regularPriorityJobs.add(job);
            } else {
                highPriorityJobs.add(job);
            }
        }

        for (PrintJob job : highPriorityJobs) {
            System.out.println("Processing high-priority print job: " + job.getDescription());
            simulatePrinting();
        }

        for (PrintJob job : regularPriorityJobs) {
            System.out.println("Processing regular print job: " + job.getDescription());
            simulatePrinting();
        }
    }
}