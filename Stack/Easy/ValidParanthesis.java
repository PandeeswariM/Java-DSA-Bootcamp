package Stack.Easy;

import java.util.Stack;

public class ValidParanthesis {

    //https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&category=Stack,Queue&difficulty=Easy&status=unsolved&sortBy=submissions
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        for(char ch:x.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if(ch==')' && s.pop()!='('){
                    return false;
                }
                if(ch=='}' && s.pop()!='{') {
                    return false;
                }
                if(ch==']' && s.pop()!='['){
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
