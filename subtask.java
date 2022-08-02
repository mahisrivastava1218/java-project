import java.util.*;
import java.lang.*;
import java.io.*;
class codechef{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
       
        for(int textcase=1;textcase<=t;textcase++){
             int n=scn.nextInt();
             int m=scn.nextInt();
             int k=scn.nextInt();
             int[] arr=new int[n];
        
             
            int count=0;
            for(int i=0;i<arr.length;i++){
                arr[i]=scn.nextInt();
            }
            for(int i=0;i<n;i++){  
                if(arr[i]==1){
                             count++;
                }if(arr[i]!=1){
                    break;
                }
            }
            if(count==m){
                       count=k;
            }else if(count==n){
                       count=100;
            }else if(count<m){
                    count=0;
               
            }else{
                    count=k;
            }
          System.out.println(count);   
        }
        
    }
}
