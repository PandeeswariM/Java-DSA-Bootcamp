package Strings.Easy;

public class IsAnagram {

    public static boolean isAnagram(String a,String b) {
        a=a.replaceAll("//s","").toLowerCase();
        b=b.replaceAll("//s","").toLowerCase();

        if(a.length()!=b.length()) return false;

      for(int i=0;i<a.length();i++){
          int start=b.indexOf(a.charAt(i));
          if(start==-1){
              return false;
          }
          b=b.substring(0,start)+b.substring(start+1);
      }
      return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("allergy","allergic"));
    }
}
