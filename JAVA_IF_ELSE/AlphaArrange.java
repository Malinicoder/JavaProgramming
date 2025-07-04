package JAVA_IF_ELSE;
import java.util.*;
public class AlphaArrange {
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        //Character input
       char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);

        if(c1<c2){

            System.out.println(c1+" "+c2);

        }
        else
            System.out.println(c2+" "+c1);
        sc.close();
    }
}
