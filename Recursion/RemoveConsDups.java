package Recursion;

public class RemoveConsDups {
    //https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
//    Input: S = “geeksforgeeks”
//    Output: geksforgeks

    public static void main(String[] args) {
        System.out.println(removeDups("geeksforgeeks"));
    }

    public static String removeDups(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.length()==1){
            return up;
        }

        char ch=up.charAt(0);
        return ch==up.charAt(1)?removeDups(up.substring(1)):ch+removeDups(up.substring(1));
    }
}
