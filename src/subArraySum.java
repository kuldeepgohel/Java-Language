public class subArraySum {
    public static void maxSubArraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.print("maximum sum of sub array:" + maxSum);
    }


    public static void kadanesAlgo(int nums[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
           cs+=nums[i];
           if(cs<0)
           {
               cs=0;
           }
           ms =Math.max(cs,ms);
        }
        System.out.print("Maximun sum is :" + ms);
    }

    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
      kadanesAlgo(number);
//        maxSubArraySum(number);
    }
}
