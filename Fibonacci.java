import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE RANGE OF FIBONACCI SERIES");
        int range=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<range;i++)
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
