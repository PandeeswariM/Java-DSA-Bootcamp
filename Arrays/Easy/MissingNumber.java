package Arrays.Easy;

import java.util.Arrays;

public class MissingNumber {

  public static int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int i=1;
       for (int j : array) {
           System.out.println(j+" "+i);
           if (j != i) {
               return j;
           }
           i++;
       }
       return -1;
    }

//    public static void main(String[] args) {
//        int n = 10;
//        int[] array= {6,1,2,8,3,4,7,10,5};
//        System.out.println(missingNumber(array,n));
//    }


    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1");
                // Introducing a delay to increase the likelihood of deadlock
                try {
                    System.out.println((12&1)==0);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 2");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock 1");
                // Introducing a delay to increase the likelihood of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Thread 2: Holding lock 2");
                }
            }
        });
        thread1.start();
        thread2.start();
        int[] arr={1,1,2,1,2,5,2,6,7,6,7,6,7};
        System.out.println("RTYYYU "+findMissingNumbers(arr));
        System.out.println(20&(-20));
    }

    public static int findMissingNumbers(int[] arr){
        int result=0;
        for(int a:arr){
            result ^=a;
        }
        return result;
    }
}
