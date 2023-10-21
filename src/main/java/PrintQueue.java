import java.util.Queue;
import java.util.LinkedList;

public class PrintQueue {
    private Queue<PrintJob> queue = new LinkedList<>();

    public void add(PrintJob job) {
        queue.offer(job);
    }

    public PrintJob getNextJob() {
        return queue.poll();
    }

    public boolean hasJobs() {
        return !queue.isEmpty();
    }
}

