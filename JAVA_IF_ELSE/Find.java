package JAVA_IF_ELSE;
import java.util.*;
public class Find {
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        //Character input
        char c1=sc.next().charAt(0);
        //Ascii value
        if((c1>=65 && c1<=90)||(c1>=97 && c1<=122)){
            System.out.println("Alphabet");
        }
        else if(c1>=48 && c1<=57){
            System.out.println("Digit");
        }
        else
        System.out.println("Special Character");
        sc.close();

    }
}
