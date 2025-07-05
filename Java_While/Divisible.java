package Java_While;

import java.util.Scanner;

public class Divisible {
     public static void main(String[] args) {
        /*Write a program to print the first 5 values which are divisible by 2,3 and 5.  */
        int arr[]=new int[5];

        int i=2;
        int ind=0; 

        while(arr[4]==0){
            if((i%2==0 && i%3==0) && i%5==0){
                arr[ind]=i;
                ind++;  
            }
            i++;
            
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        
    }
}
