import java.util.ArrayList;

public class dice_sum {
    public static void main(String[] args) {
//            dice("",4);
//            ArrayList<String> ans=dicelist("",5);
//            System.out.println(ans);
//            dice("",9);
//            diceface("",9,9);


    }
    static void dice(String ans,int target){
        if (target==0){
            System.out.println(ans);
            return ;
        }
        for (int i = 1; i < 6 && i<=target; i++) {
            dice(ans+i,target-i);
        }
    }
    static ArrayList<String> dicelist(String ans, int target){
        if (target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> anslist=new ArrayList<>();

        for (int i = 1; i < 6 && i<=target; i++) {
            anslist.addAll(dicelist(ans+i,target-i));
        }
        return anslist;
    }
    static void diceface(String ans,int target,int face){
        if (target==0){
            System.out.println(ans);
            return ;
        }
        for (int i = 1; i < face && i<=target; i++) {
            diceface(ans+i,target-i,face);
        }
}
}