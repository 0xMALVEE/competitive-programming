import java.util.*;



class Solution {

    public static void maxSubArraySum (int ar[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;


        for(int i=0;i < ar.length;i ++){
            cs = cs + ar[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.print(ms);

    }

    public static void main (String args[]){
        

    }
}

class Person {
    String name;
    int age ;
}