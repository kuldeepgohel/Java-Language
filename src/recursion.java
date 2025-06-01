public class recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sumOfN(n - 1);
        int sum = n + snm1;
        return sum;
    }

    public static boolean isShorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isShorted(arr, i + 1);
    }

    public static int firstOccurrence(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == key) {
            return idx;
        }
        return firstOccurrence(arr, key, idx + 1);
    }

    public static int lastOccurrence(int arr[], int key, int idx) {
        if (idx == 0) {
            return -1;
        }

        if (arr[idx] == key) {
            return idx;
        }
        return firstOccurrence(arr, key, idx - 1);
    }

    public static int powerOfn(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powerOfn(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSqr = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSqr = a * halfPowerSqr;
        }
        return halfPowerSqr;
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int f = fnm1 + fnm2;
        return f;
    }

    public static int tilingProblem(int n) {
        //n denote the length of floor
        if (n == 0 || n == 1) {
            return 1;
        }


        // first for vertical choice and second for horizontal  choice
        return tilingProblem(n - 1) + tilingProblem(n - 2);

    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsParing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        //first for stay single and second for (n-1) choice to make pair and another (n-2) remaining for paring
        return friendsParing(n - 1) + (n - 1) * friendsParing(n - 2);
    }
    public static void binaryString (int n,int lastPlace,String str )
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str+"0");
        if(lastPlace!=1)
        {
            binaryString(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 2, 3, 4, 5, 4, 2, 6, 2, 5, 8, 3};
        int i = 0;
//        System.out.println(isShorted(arr,i));
//        printDec(n);
//        printInc(n);
//        System.out.println(factorial(5));
//        System.out.println(sumOfN(n));
//        System.out.println(firstOccurrence(arr, 4, 0));
//        System.out.println(lastOccurrence(arr, 5, arr.length - 1));
//        System.out.println(powerOfn(2,5));

//        System.out.println(optimizedPower(2, 5));
//        System.out.println( fibo(8));
//        System.out.println(tilingProblem(4));

//        String str = "appnacollage";
//        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
//        System.out.println(friendsParing(3));
        String str = "";
        binaryString(3,0,str);
    }



}

