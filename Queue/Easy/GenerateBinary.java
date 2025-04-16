package Queue.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    //https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1?page=1&category=Queue&company=Amazon&difficulty=Easy&sortBy=difficulty
    static ArrayList<String> generate(int N)
    {
        Queue<String> q=new LinkedList<>();
        ArrayList<String> list=new ArrayList<>();
        q.add("1");
        while(N-- > 0){
            String result=q.poll();
            list.add(result);
            q.add(result+"0");
            q.add(result+"1");
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(7));
    }
}
