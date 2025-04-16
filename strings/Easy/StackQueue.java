package Strings.Easy;

import java.util.Stack;

public class StackQueue {
    //https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&category=Queue&company=Amazon&difficulty=Easy&sortBy=difficulty
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x) {
        // Your code here
        s1.push(x);
    }


    //Function to pop an element from queue by using 2 stacks.
    int Pop() {
        // Your code here
        if (s1.isEmpty() && s2.isEmpty()) {
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
}

