package Queue.Easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    //https://www.geeksforgeeks.org/problems/queue-reversal/1?page=1&category=Queue&company=Amazon&difficulty=Easy&sortBy=difficulty

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(7);
        q.add(4);
        q.add(5);
        q.add(1);
        System.out.println(reverseQueue(q));
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        return q;
    }

    //without using stack
    public static Queue<Integer> rev(Queue<Integer> q) {
        if (q.isEmpty()) {
            return q;
        }
        int front = q.poll();
        rev(q);
        q.add(front);
        return q;
    }
}
