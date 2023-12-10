import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            String s=sc.next();
            int m=sc.nextInt();
            String l=sc.next();
            String r=sc.next();
            int max=-1;
            boolean ans=false;
            for(int i=0;i<m;i++){
                int nums=r.charAt(i)-l.charAt(i);
                int count=0;
                while(count<=nums){
                    char num=(char)(l.charAt(i)+count);
                    int index=s.indexOf(num);
                    if(index==-1){
                        ans=true;
                        break;
                    }else{
                        max=Math.max(max,index);
                        //    s=s.substring(max+1);
                    }
                    count++;


                }
                if(ans)break;
                s=s.substring(max+1);
                max=0;


            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
