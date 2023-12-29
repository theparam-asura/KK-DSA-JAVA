import java.util.ArrayList;

public class recursion2 {
    public static void main(String[] args) {
        int []arr={5,1,4,3,2};
        int []arr1={1,2,3,3,4,5,6,7,4,4};
//        System.out.println(sorted(arr1,0));
//        System.out.println(sorted(arr,0));
//        System.out.println(linearsearch(arr,10,0));
//        System.out.println(linearsearch(arr,2,0));
//        findallindex(arr1,3,0);
//        System.out.println(list);
//        System.out.println(findallindex2(arr1,4,0));
        System.out.println(rotatedbs(arr1,5,0,arr1.length-1));

    }
    static boolean sorted(int []arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
    static int linearsearch(int[]arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearsearch(arr,target,index+1);

    }
    static boolean linearsearch1(int[]arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target ||linearsearch1(arr,target,index+1);
    }
    static  ArrayList <Integer> list=new ArrayList<>();
    static void findallindex(int[]arr, int target, int index){
        if (index==arr.length){
            return  ;
        }
        if(arr[index]==target){
            list.add(index);
        }
         findallindex(arr,target,index+1);
    }
    static ArrayList<Integer> findallindex1(int[]arr, int target, int index,ArrayList<Integer> list1){
        if (index==arr.length){
            return list1 ;
        }
        if(arr[index]==target){
            list1.add(index);
        }
        return  findallindex1(arr,target,index+1,list1);
    }
    static ArrayList<Integer> findallindex2(int[]arr, int target, int index){
        ArrayList<Integer> list2=new ArrayList<>();
        if (index==arr.length){
            return list2 ;
        }
        if(arr[index]==target){
            list2.add(index);
        }
        ArrayList<Integer> ansbelow=findallindex2(arr,target,index+1);
        list2.addAll( ansbelow);
        return  list2;
    }
    static int rotatedbs(int[]arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s]&& target<arr[m]){
                return rotatedbs(arr,target,s,m-1);
            }
            else{
                return rotatedbs(arr,target,m+1,e);
            }
        }
        if (target>=arr[m]&&target<arr[m]){
            return rotatedbs(arr,target,m+1,e);
        }
        return rotatedbs(arr,target,s,m-1);
    }

}
