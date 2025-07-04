package JAVA_IF_ELSE;
import java.util.*;
public class Positive_negative {
    public static void main(String[] args) {
        //input Scanner obj
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number>0){
            System.out.println("Positive Number");
        }
        else if(number<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }

        sc.close();
    }
}
