/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main{
    static int maxCount(String str, int n){
        int count0=0,count1=0;//to store count of 1's and count of 0's in each substring formed
        int final_cnt=0;//to store the final count of all the substrings formed
        for(int i=0;i<n;i++){
            if(str.charAt(i)==0){
            count0++;
            }
            else{
            count1++;
            }
            if(count0==count1){
            final_cnt++;
        }
        }
        if(count0!=count1){
        return -1;
        }
        return final_cnt;
    }
    public static void main(String args[]){
        String str="0100110101";
        int n=str.length();
        System.out.println(maxCount(str,n));
    }
}
