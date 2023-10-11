public class ProcessEntity implements Comparable<ProcessEntity> {
 private int processID;
 private String processName;
 private int priority;
 // Constructors, getters, setters, and compareTo method implementation
 @Override
 public int compareTo(ProcessEntity other) {
 return Integer.compare(this.priority, other.priority);
 }
}
import java.util.ArrayList;
import java.util.List;
public class PriorityQueue {
 private List<ProcessEntity> heap;
 // Constructors and methods for push, pop, _heapifyUp, and _heapifyDown
}
public class PriorityScheduling {
 public static void priorityScheduling(List<ProcessEntity> processes) {
 PriorityQueue priorityQueue = new PriorityQueue();
 for (ProcessEntity process : processes) {
 priorityQueue.push(process);
 }
 while (true) {
 ProcessEntity process = priorityQueue.pop();
 if (process == null) {
 break;
 }
 System.out.println("Process ID: " + process.getProcessID() +
 ", Process Name: " + process.getProcessName() +
 ", Priority: " + process.getPriority());
 }
 }
 public static void main(String[] args) {
 ProcessEntity process1 = new ProcessEntity(1, "Process A", 3);
 ProcessEntity process2 = new ProcessEntity(2, "Process B", 2);
 ProcessEntity process3 = new ProcessEntity(3, "Process C", 1);
 ProcessEntity process4 = new ProcessEntity(4, "Process D", 4);
 List<ProcessEntity> processes = new ArrayList<>();
 processes.add(process1);
 processes.add(process2);
 processes.add(process3);
 processes.add(process4);
 priorityScheduling(processes);
 }
}
