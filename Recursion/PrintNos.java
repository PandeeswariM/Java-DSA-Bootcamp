package Recursion;

public class PrintNos {
    public static void main(String[] args) {
        printNos(5);
    }

    public static void printNos(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNos(n-1);
    }
}
