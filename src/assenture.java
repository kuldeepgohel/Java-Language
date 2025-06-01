public class assenture {
    public static  int minimumSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        int ans = 0;
        ans = (1 << count) - 1;
        return ans;
    }
    public static void kSpaceWord(String s , int k)
    {
       for(int i=0 ; i<s.length();i++)
       {
           if(s.charAt(i) == ' ')
           {
               k--;
               if(k==0) break;
           }
           System.out.print(s.charAt(i));
       }
    }
    public static int bulb(int[] arr)
    {
        int count = 0 ;
        int n =arr.length;
        boolean reverse = false ;

        for(int i=0 ; i<n ; i++)
        {
            if((arr[i]== 0 && reverse==false)||(arr[i]==1 && reverse == true))
            {
                count++;
                arr[i]=1;
                reverse=!reverse;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//            System.out.println(minimumSetBit(10));
            String s = "Hello this is a vsCode";
//            kSpaceWord(s,2);
            int arr[] = {1,0,0,0,1};
        System.out.println(bulb(arr));
        }
    }

