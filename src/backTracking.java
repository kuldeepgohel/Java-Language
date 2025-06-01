public class backTracking {
    public static void changeArray(int arr[], int idx, int val) {
        //base case
        if (idx == arr.length) {
            printArray(arr);
            return;
        }
        //recursion
        arr[idx] = val;
        changeArray(arr, idx + 1, val + 1);
        arr[idx] = arr[idx] - 2;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void SubSet(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            {
                System.out.println(ans);
                return;
            }
        }

        //recursion
        //yes choice
        SubSet(str, ans + str.charAt(i), i + 1);
        //no choice
        SubSet(str, ans, i + 1);
    }

    public static void findPermutation(String str, String ans) {
//base case
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++)
        {
            char currChar= str.charAt(i);
            //"abcde"=>"ab" + "de" = "abde"
             String Newstr = str.substring(0,i)+str.substring(i+1);
            findPermutation(Newstr,ans+currChar);
        }
    }
    public static int gridWay(int i, int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            //condition for last cell
            return 1;
        } else if (i==n || j==n) {//boundary cross  condition
            return 0;
        }


        int w1 =gridWay(i+1,j,n,m);
        int w2 = gridWay(i,j+1,n,m);
        return w1+w2;
    }

    public static void main(String[] args) {
//        int arr[] = new int[5];
//        changeArray(arr, 0, 1);
//        printArray(arr);
//        String str = "abc";
//        SubSet(str, "", 0);
//        findPermutation(str,"");
        int n=3,m=3;
        System.out.println(gridWay(0,0,n,m));
    }
}
