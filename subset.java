import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
//        subset("","abc");
//        System.out.println(subsetarr("","abc"));
        subsetascii("","abc");

    }
    static void subset(String ans,String input){
        if (input.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=input.charAt(0);
        subset(ans+ch,input.substring(1));
        subset(ans,input.substring(1));
    }
    static ArrayList<String> subsetarr(String ans, String input){
        if (input.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(ans);
            return list ;
        }
        char ch=input.charAt(0);
        ArrayList<String> left = subsetarr(ans+ch,input.substring(1));
        ArrayList<String> right = subsetarr(ans,input.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsetascii(String ans,String input){
        if (input.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=input.charAt(0);
        subsetascii(ans+ch,input.substring(1));
        subsetascii(ans,input.substring(1));
        subsetascii(ans+(ch+0),input.substring(1));
    }
}
