import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int arr[]= new int[n+1];
            int pos[]= new int[n+1];
            for(int i=1; i<arr.length; i++){
                int num=in.nextInt();
                arr[i]=num;
                pos[num]=i;


            }
            int count=0;
            for(int i=1; i<pos.length-1; i++){
                if(pos[i]>pos[i+1]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }





}