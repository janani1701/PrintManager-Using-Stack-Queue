import java.util.Stack;

public class PriorityPrintStack {
    private Stack<PrintJob> stack = new Stack<>();

    public void add(PrintJob job) {
        stack.push(job);
    }

    public PrintJob getNextJob() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public boolean hasJobs() {
        return !stack.isEmpty();
    }
}

