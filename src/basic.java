import java.util.*;
import java.math.*;

public class basic {
    public static void decitobinary(int n)
    {
        int number = n;
        int p = 0;
        int bin = 0;
        while (n>0)
        {
            int rem = n % 2 ;
            bin += rem*(int)Math.pow(10,p);
            p++;
            n=n/2;
        }
        System.out.println(bin);
    }
    public static void binarytodecimal(int n) {
        int number = n;
        int p = 0;
        int dec = 0;
        while (n > 0)
        {
            int ld = n % 10 ;
            dec +=ld*(int)Math.pow(2,p);
            p++;
            n=n/10;
        }
        System.out.println("decimal of "+number+" binary number is:"+dec);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n :");
        int n = sc.nextInt();
//        binarytodecimal(binary_no);
        decitobinary(n);

    }


}
