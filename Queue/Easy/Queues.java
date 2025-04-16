package Queue.Easy;

import java.util.LinkedList;
import java.util.Queue;

class Queues
{
    //https://www.geeksforgeeks.org/problems/stack-using-two-queues/1?page=1&category=Queue&company=Amazon&difficulty=Easy&sortBy=difficulty
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    //Function to push an element into stack using two queues.
    void push(int a)
    {
        // Your code here
        q2.add(a);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap the names of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    //Function to pop an element from stack using two queues.
    int pop()
    {
        // Your code here
        if (q1.isEmpty()) {
            return -1;
        }

        // Dequeue the top element (which is at the front of q1)
        return q1.poll();
    }

}
