import java.util.Objects;

public class recursionsubset {
    public static void main(String[] args) {
//        skip("","baccad");
//        System.out.println(skip1("baccad"));
//        System.out.println(skipstring("An apple a day keeps the doctor away "));
//        System.out.println(skipstringreq("An apple a day keeps the doctor away "));
        System.out.println(reverse("reverseal"));

    }
    static void skip(String s,String ans){
          if (Objects.equals(ans, "")){
              System.out.println(s);
              return ;
          }
          char ch=ans.charAt(0);
          if (ch=='a'){
              skip(s,ans.substring(1));
          }
          else{
              skip(s+ch,ans.substring(1));
          }

    }
    static String skip1(String ans){
        if (Objects.equals(ans, "")){

            return " " ;
        }
        char ch=ans.charAt(0);
        if (ch=='a'){
           return  skip1(ans.substring(1));
        }
        else{
            return ch + skip1(ans.substring(1));
        }

    }
    static String skipstring(String ans){
        if (ans.isEmpty()){
            return "";
        }
        if (ans.startsWith("apple")){
            return skipstring(ans.substring(5));
        }
        else{
            return ans.charAt(0)+skipstring((ans.substring(1)));
        }

    }
    static String skipstringreq(String ans){
        if (ans.isEmpty()){
            return "";
        }
        if (ans.startsWith("app") && !ans.startsWith("apple")){
            return skipstringreq(ans.substring(5));
        }
        else{
            return ans.charAt(0)+skipstringreq((ans.substring(1)));
        }
    }
    static String reverse(String s){
        if (s.length()==0){
            return s;
        }
        else{
            return reverse(s.substring(1))+s.charAt(0);
        }
    }
}
