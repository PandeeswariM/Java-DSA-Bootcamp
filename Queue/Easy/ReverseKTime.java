package Queue.Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKTime {
//https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1?page=1&category=Queue&difficulty=Easy&sortBy=submissions
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if(k<=0 || q.isEmpty()){
            return q;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }

        while(!stack.isEmpty()){
            q.add(stack.pop());
        }

        for(int i=0;i<q.size()-k;i++){
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        System.out.println(Arrays.toString(modifyQueue(q, 3).toArray()));
    }
}
