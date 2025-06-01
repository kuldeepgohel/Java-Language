
public class ButterflyPattern {

    public static void butterfly(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        //2nd half
        for (int i = n; i > 0; i--) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");


        }
    }

    public static void rhombus(int n )
    {
        for(int i= 1 ; i<=n ; i++)
        {
            // spaces
            for(int j = 1 ; j <=(n-i);j++)
            {
                System.out.print(" ");
            }

            // stars
            for(int j =1 ; j <=n ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static void diamond(int n )
    {
        for(int i = 1 ; i<= n ; i++)
        {
            //for spaces
            for(int j=1 ; j<=(n-i) ; j++)
            {
                System.out.print(" ");
            }

            // for stars
            for(int j =1 ; j<=(2*i-1) ; j++)
            {
                System.out.print("*");
            }
            //for spaces
            for(int j=1 ; j<=(n-i) ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = n ; i >0 ; i--)
        {
            //for spaces
            for(int j=1 ; j<=(n-i) ; j++)
            {
                System.out.print(" ");
            }

            // for stars
            for(int j =1 ; j<=(2*i-1) ; j++)
            {
                System.out.print("*");
            }
            //for spaces
            for(int j=1 ; j<=(n-i) ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

//        butterfly(5);
//        rhombus(5);
        diamond(5);
    }
}
