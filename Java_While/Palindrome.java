package Java_While;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        /*Write a program to find if the given number is palindrome or not. */
        Scanner sc=new Scanner(System.in);
        //reverse
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }//temp=0

        //System.out.println(sum);
        //check
        if(sum==num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
