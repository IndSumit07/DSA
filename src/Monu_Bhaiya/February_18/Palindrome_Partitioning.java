package Monu_Bhaiya.February_18;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String s = "nitin";
        rec(s, "");
    }
    public static void rec(String ques, String ans){
      if(ques.length()==0){
          System.out.println(ans);
          return;
      }

        for(int i=1; i<=ques.length(); i++){

            String s=ques.substring(0, i);
            rec(ques.substring(i), ans+s+"|");
        }
    }
}
