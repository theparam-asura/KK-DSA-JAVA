import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {
//        numpad("","12");
//        ArrayList<String> ans=numpadal("","12");
//        System.out.println(ans);
//        PhoneNumberCombinations("","23");
        System.out.println(numpadcount("","12"));


    }
    static void numpad(String ans,String input){
        if (input.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit=input.charAt(0)-'0';
        for (int i = (digit-1)*3 ; i < digit*3 ; i++) {
            char ch=(char)('a'+i);
            numpad(ans+ch,input.substring(1));

        }
    }
    static ArrayList<String> numpadal(String ans, String input){
        if (input.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> anslist=new ArrayList<>();
        int digit=input.charAt(0)-'0';
        for (int i = (digit-1)*3 ; i < digit*3 ; i++) {
            char ch=(char)('a'+i);
            anslist.addAll(numpadal(ans+ch,input.substring(1)));
        }
        return anslist;
    }
    static int numpadcount(String ans,String input) {
        if (input.isEmpty()) {
            return 1;
        }
        int count=0;
        int digit = input.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
           count=count+ numpadcount(ans + ch, input.substring(1));

        }
        return count;
    }


    static void PhoneNumberCombinations(String ans, String input) {
            // Mapping of digits to letters
        String[] mapping = {
                    "",     // 0
                    "",     // 1
                    "abc",  // 2
                    "def",  // 3
                    "ghi",  // 4
                    "jkl",  // 5
                    "mno",  // 6
                    "pqrs", // 7
                    "tuv",  // 8
                    "wxyz"  // 9
        };

        if (input.isEmpty()) {
                System.out.println(ans);
                return;
        }

        int digit = input.charAt(0) - '0';
        String letters = mapping[digit];

        for (int i = 0; i < letters.length(); i++) {
                char ch = letters.charAt(i);
                PhoneNumberCombinations(ans + ch, input.substring(1));
        }
    }
}
