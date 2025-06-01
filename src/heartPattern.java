public class heartPattern {

    public static void heart(int n)
    {
       // 1st half of heart
        for(int i= 1 ; i<=n ; i ++)
        {
            //for starting spaces
            for( int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            //for 1st star occurrence
            for(int j = 1 ; j <=(2*i-1);j++)
            {
                System.out.print("*");
            }
            //for middle spaces
            for( int j = 1 ; j <=2*(n-i) ; j++)
            {
                System.out.print(" ");
            }
            //for 2nd occurrence of stars
            for(int j = 1 ; j <=(2*i-1);j++)
            {
                System.out.print("*");
            }

            //for end spaces
            for( int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        //2nd half of heart
        for(int i =1 ; i<=n+2; i++)
        {
            //for space
int k =1;
            for(int j=2 ; j <=i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=n-i+2*k;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<=n-i+2*k;j++)
            {
                System.out.print("*");

            }
            k += 2;

            System.out.println();
        }

    }

    public static void main(String[] args) {
        heart(4);
    }
}
