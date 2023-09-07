package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        // *****************************************************

        // Queue = FIFO DATA structure. First in First out (ex: A Line of people )
        //         A collection designed for holding elements prior to processing
        //         Linear data structure
        //
        //         add()  = enqueue, offer() - do not cause an exception
        //         remove()  = dequeue, poll() - do not cause an exception / throw exception

        // *****************************************************


        // Where are queues useful?
        // 1. Keyboard Buffer (Letters should appear on the screen in the order they are pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first Search

        Queue<String> queue = new LinkedList<>();

        queue.offer("Keren");
        queue.offer("John");
        queue.offer("Brain");
        queue.offer("Liz");
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("John"));
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue.peek());

        System.out.println(queue);

    }
}
