package lesson_7;


import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<>();

    // adding element to queue
    queue.add("hello");
    queue.add("world");
    queue.add("aalam");
    queue.add("salam");
    printData(queue);

    // polling element (getting and removing from queue the element)
    queue.poll();
    printData(queue);

    queue.poll();
    printData(queue);

  }

  public static void printData(Queue<String> collection) {
    for (String s : collection) {
      System.out.println(s);
    }
    System.out.println("--------");
  }

}
