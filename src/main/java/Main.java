import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<PrintJob> printJobs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter print job description:");
            String description = scanner.nextLine();

            System.out.println("Enter priority (1 for low, 2 for high):");
            int priority = Integer.parseInt(scanner.nextLine());

            PrintJob job = new PrintJob(description, priority);
            printJobs.add(job);

            System.out.println("Do you want to print something else? (Y/N):");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);

        // Process and display all print jobs, giving priority to high-priority jobs
        PrintJobManager.printAllJobs(printJobs);

        scanner.close();
    }
}
