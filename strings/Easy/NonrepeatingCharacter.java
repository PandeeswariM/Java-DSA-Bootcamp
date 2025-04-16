package Strings.Easy;

public class NonrepeatingCharacter {

    static char nonrepeatingCharacter(String S)
    {
        boolean flag=true;
        //Your code here
        while (flag){
            char start=S.charAt(0);
            S=S.substring(0,0)+S.substring(1);
            if(S.indexOf(start)==-1){
                return start;
            }
            S=S.replaceAll(String.valueOf(start),"");
            if(S.length()==0){
                flag=false;
            }
        }
        return 'S';
    }

    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("yy"));
    }
}
