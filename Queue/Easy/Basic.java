package Queue.Easy;

import javax.print.event.PrintEvent;
import java.util.Stack;

public class Basic {

    int front, rear;
    int arr[] = new int[100005];

    Basic() {
        front=-1;
        rear=-1;
    }

    //Function to push an element x in a queue.
    void push(int x) {
        if(arr.length==0){
            return;
        }
        if(front==-1){
            front++;
        }
        rear++;
        arr[rear]=x;
    }

    //Function to pop an element from queue and return that element.
    int pop() {
        if(rear<front || front==-1){
            return -1;
        }
        int temp=arr[front];
        front++;
        return temp;
    }

    int top(){
        if(rear<front || front==-1){
            return -1;
        }
        return arr[front];
    }

    public static String reverse(Stack<String> stack){
        return stack.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("ggsgs.kjsjiaj.jsiajsi");
        System.out.println(reverse(stack));
    }
}
