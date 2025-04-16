package Strings.Easy;

public class ReverseWords {

    static String reverseWords(String str) {
        // code here
        String[] strs=str.split("\\.");
        return reverseWord(strs,0,new StringBuilder());
    }

    private static String reverseWord(String[] strs, int i,StringBuilder str) {
        if(i==strs.length){
            return str.toString();
        }
        reverseWord(strs,i+1,str);
        if(i==0){
            str.append(strs[i]);
        }else {
            str.append(strs[i]).append(".");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
