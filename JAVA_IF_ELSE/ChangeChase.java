package JAVA_IF_ELSE;

import java.util.Scanner;

public class ChangeChase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c1=sc.next().charAt(0);

        if((c1>=65 && c1<=90)){
            c1+=32;
        }
        else
        c1-=32;

    System.out.println(c1);

    sc.close();
    }
    
}
