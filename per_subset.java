import java.util.ArrayList;

public class per_subset {
    public static void main(String[] args) {
//        subset("","abc");
        ArrayList<String> ans=permutationlist("","23456789");
        System.out.println(ans);
        System.out.println(permutationcount("","abc"));
    }
    static void subset(String ans,String input){
        if (input.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=input.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());
            subset(first+ch+second,input.substring(1));

        }
    }
    static ArrayList<String> permutationlist(String ans, String input){

        if (input.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch=input.charAt(0);
        ArrayList<String> ans1 =new ArrayList<>();

        for (int i = 0; i <= ans.length(); i++) {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());
            ans1.addAll(permutationlist(first+ch+second,input.substring(1)));
        }
        return ans1;
    }
    static int permutationcount(String ans,String input){
        if (input.isEmpty()){
            return 1;
        }
        char ch=input.charAt(0);
        int count=0;
        for (int i = 0; i <= ans.length(); i++) {
            String first=ans.substring(0,i);
            String second=ans.substring(i,ans.length());
            count=count+permutationcount(first+ch+second,input.substring(1));

        }
        return count;
    }
}
