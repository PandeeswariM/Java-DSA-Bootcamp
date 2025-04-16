package Stack.Easy;

import java.util.Stack;

public class DeleteMidStack {

    //https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1?page=1&category=Stack,Queue&difficulty=Easy&status=unsolved&sortBy=submissions
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        int mid=(sizeOfStack)/2;
        deleteMiddle(s,0,mid);
    }

    public void deleteMiddle(Stack<Integer> s, int current,int mid){
        if(s.isEmpty()){
            return;
        }

        int temp=s.pop();
        if(current!=mid){
            deleteMiddle(s,current+1,mid);
            s.push(temp);
        }
    }
}
