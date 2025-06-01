import java.util.*;

public class pattern {
    public static void hollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }

    public static void halfPyramid(int r) {
        for (int i = 1; i <= r; i++) {

            int j;
            for (j = 0; j <= r - i; j++) {
                System.out.print(j + 1);
            }
            for (int k = j; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void floudsTriangle(int r) {
        int c=1;
        for (int i = 1; i <= r; i++)
        {
            for(int j = 1 ; j<=i ;j++ )
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void zeroOne(int r)
    {
        for(int i =1 ; i<=r ; i++)
        {
            for(int j = 1 ; j<=i ;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int r = sc.nextInt();
        System.out.print("enter the number of colums:");
        int c = sc.nextInt();
       hollowRectangle(r,c);
    //    halfPyramid(r);
    //    floudsTriangle(r);
        // zeroOne(r);

        sc.close();
    }
}
