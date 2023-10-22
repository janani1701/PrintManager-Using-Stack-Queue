# PrintManagerUsingStackAndQueue

This is a Java program that simulates a print job manager, which allows users to input print jobs with descriptions and priorities and processes them, giving priority to high-priority print jobs. The program utilizes multiple classes and multithreading for efficient job management.

## Classes

### Main

- The `Main` class is the entry point for the program, handling user input and interaction with the `PrintJobManager`.

### PrintJob

- The `PrintJob` class represents a print job with a description and a priority.

### PrintJobManager

- The `PrintJobManager` class manages the submission and processing of print jobs. It employs multithreading, utilizing a print queue for regular jobs and a priority print stack for high-priority jobs.

### PrintQueue

- The `PrintQueue` class represents a regular print queue for low-priority print jobs.

### PriorityPrintStack

- The `PriorityPrintStack` class represents a priority print stack for high-priority print jobs.

## How to Use

1. Compile and run the `Main.java` class to initiate the print job manager.

2. The program will prompt you to enter a print job description and select a priority (1 for low, 2 for high). You can continue adding print jobs as long as you want.

3. To stop adding print jobs, enter "N."

4. The program will then process and display all print jobs, giving priority to high-priority print jobs using multithreading.

## Multithreading Logic

- The program simulates the printing process by introducing a 1-second delay using multithreading. This delay mimics the time it takes to print a job.

- The `PrintJobManager` class controls the flow of print jobs. It processes high-priority jobs first and then regular jobs. This is achieved by utilizing two data structures: a `PriorityPrintStack` for high-priority jobs and a `PrintQueue` for regular jobs.

## Handling Job Priority

- The program efficiently handles job priority by processing high-priority jobs before regular jobs. High-priority print jobs are stored in the `PriorityPrintStack`, ensuring that they are processed promptly. Regular jobs are stored in the `PrintQueue` and processed in the order they were received.

- Users can designate a job's priority when adding it. High-priority jobs are typically reserved for urgent or critical documents, ensuring that they are printed without unnecessary delays.

## Customization

- You can customize the delay used for simulating the printing process by adjusting the `simulatePrinting` method in the `PrintJobManager` class. If you want a faster or slower printing simulation, simply modify the sleep duration in milliseconds.



