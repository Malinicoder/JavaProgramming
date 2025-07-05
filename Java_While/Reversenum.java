package Java_While;

import java.util.Scanner;

public class Reversenum {
     public static void main(String[] args) {
        /*Write a program to reverse a   given number and print */
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println(sum);

        sc.close();
    }
}
