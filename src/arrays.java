public class arrays {

    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static int largerstSmallest(int number[]) {
        int larger = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > larger) {
                larger = number[i];
            }

            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        System.out.println("smallest element in array is :" + smallest);
        return larger;
    }

    public static int binarySearch(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            }
            // start

            else { //left
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void reverse(int number[]) {
        int start = 0, end = number.length - 1;


        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;

        }

    }


    public static void pairInarray(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")" + " ");
                tp++;
            }
            System.out.println("");
        }

    }

    public static void subArrayMaxSum(int number[]) {
        int currenSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            currenSum = 0;
            for (int j = i + 1; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k < end; k++) {
                    currenSum += number[k];
                }
                if (maxSum < currenSum) {
                    maxSum = currenSum;
                }
                System.out.println(currenSum);
            }
            System.out.println();
        }
        System.out.println("Maximum Sum is :" + maxSum);
    }

    public static void subArray(int n[]) {
        int currentsum = 0;
        int start, end = 0;
        for (int i = 0; i < n.length; i++) {
            start = i;
            for (int j = i + 1; j < n.length; j++) {
                end = j;
                for (int k = start; k < end; k++) {

                    System.out.print("[" + n[k] + "]");

                }

                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        int n[] = new int[10];
        int marks[] = {67, 85, 97};
        int num1[] = {2, 4, 6, 8};
        int key = 6;

//        int largerNumber = largerstSmallest(numbers);
//        System.out.println("Largest Element in array is "+largerNumber);
//       int ans = linearsearch(numbers, key);

//       if(ans==-1)
//       {
//           System.out.println("Element not found ");
//       }
//       else {
//           System.out.print("key is at index: "+ans);
//       }
//        int binarySearch = binarySearch(numbers,key);
//        System.out.println(binarySearch);

//        reverse(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        pairInarray(num1);
        subArrayMaxSum(num1);
//subArray(num1);
    }
}
