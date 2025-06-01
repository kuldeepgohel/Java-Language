public class sorting {
    public static void bubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {

            for (int j = 0; j < arr.length - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }
    }

    public static void insertionShort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i - 1;
            //finding out the correct position to insert
            while (pre >= 0 && arr[pre] > curr) {
                arr[pre + 1] = arr[pre];
                pre--;
            }
            //insertion
            arr[pre + 1] = curr;
        }
    }


    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countingSort(int nums[]) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
             nums[j]=i;
             j++;
             count[i]--;
            }
        }


    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,6,2,3,1};
//        sorting(arr);
//        selectionSort(arr);
//        insertionShort(arr);
        countingSort(arr);
        printArray(arr);
    }
}
