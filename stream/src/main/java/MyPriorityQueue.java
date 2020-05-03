import java.util.PriorityQueue;

/**
 * @Description:
 * @原理：
 * @业务流程：
 * @author: 楠木
 * @date: 20/03/25 9:50
 * @version: V1.0
 */
public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<Integer>((n1, n2)->n2-n1);
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(10);
        priorityQueue.add(8);
        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); ;
        }
    }
}
