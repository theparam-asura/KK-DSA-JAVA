class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    boolean even(int num){
        int numberofdigits=digits(num);
        /*
        if (numberofdigits %2 ==0){
            return true;
        }
        return false;
        */
        return numberofdigits %2 == 0;
    }
    int digits(int num){
        int count=0;
        if(num<0){
            num= num*-1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){


            count++;
            num=num/10;
        }
        return count;
    }

}