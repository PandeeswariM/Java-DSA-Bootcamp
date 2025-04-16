package Stack.Easy;

public class Basic {
    private int[] arr;
    private int top;

    public Basic() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if(arr.length==0){
            return;
        }
        top=top+1;
        arr[top]=x;
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        int temp=arr[top];
        top--;
        return temp;
    }

    public int top(){
        if(top==-1){
            return -1;
        }
        return arr[top];
    }
}
