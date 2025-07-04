package JAVA_IF_ELSE;
import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        if(num1%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        sc.close();
    }
    
}
