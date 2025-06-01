public class bitManipulation {
    public static void oddEven(int num) {
        int num1 = 1;
        if ((num & num1) == 0) {
            System.out.println(num + " is even number ");
        } else {
            System.out.println(num + " is odd number ");
        }
    }

    public static int getIthBit(int num, int i) {
        int bitMask = (1 << i);
        if ((num & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int num, int i) {
        int bitMask = (1 << i);
        return num | bitMask;
    }

    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
//       if(newBit==0)
//       {
//           return clearIthBit(num, i);
//       }else {
//          return setIthBit(num,i);
//       }
        int n = clearIthBit(num, i);
        int bitMask = newBit << 1;
        return n | bitMask;
    }

    public static int clearLastIthBit(int num, int i) {
        int bitMask = (~0) << i;
        return num & bitMask;
    }

    public static int clearRangOfIthBit(int n, int i, int j) {

        int a = ((-0) << j);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {//check LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }



    public static int fastExponential(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = a * ans;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println((5&6)); // binary AND
//        System.out.println((5|6)); // binary OR
//        System.out.println((5^6)); // binary XOR
//        System.out.println(~5); // one's compliment
//        System.out.println((5<<2)); // binary left shift
//        System.out.println(6>>1);
//        oddEven(4);
//        System.out.println(getIthBit(9, 2));
//        System.out.println(setIthBit(9, 2));
//        System.out.println(clearIthBit(10,1));
//        System.out.println(updateIthBit(10,1,0));
//        System.out.println(clearLastIthBit(15, 2));
//        System.out.println(clearRangOfIthBit(10, 2, 4));
//        System.out.println(isPowerOfTwo(8));
//        System.out.println(countSetBit(11));
//        System.out.println(fastExponential(2, 3));

    }
}
