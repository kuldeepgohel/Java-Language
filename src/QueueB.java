import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueB {
//    static class QueueS {
//        static Stack<Integer> s1 = new Stack<>();
//        static Stack<Integer> s2 = new Stack<>();
//
//
//        public static boolean isEmpty() {
//            return s1.isEmpty();
//        }
//
//        //add function - O(N)
//        public static void add(int data) {
//            while (!s1.isEmpty()) {
//                s2.push(s1.pop());
//            }
//            s1.push(data);
//            while (!s2.isEmpty()) {
//                s1.push(s2.pop());
//            }
//        }
//
//        // remove-O(1)
//        public static int remove() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return s1.pop();
//        }
//
//        //peek-O(1)
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return s1.peek();
//
//        }
//
//    }
//    static class Queue {
//        static int arr[];
//        static int size;
//        static int rear;
//        static int front;
//
//        Queue(int n) {
//            arr = new int[n];
//            size = n;
//            rear = -1;
//            front = -1;
//        }
//
//        //circular Queue
//        public static boolean isEmpty() {
//            return rear == -1 && front == -1;
//        }
//
//        public static boolean isFull() {
//            return (rear + 1) % size == front;
//        }
//
//        public static void add(int data) {
//            if (isFull()) {
//                System.out.println("Queue is full");
//                return;
//            }
//            //add first elements
//            if(front == -1 )
//            {
//                front=0;
//            }
//            rear =( rear+1)%size ;
//            arr[rear]=data;
//        }
//        public static int remove()
//        {
//            if(isEmpty())
//            {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int result = arr[front];
//            //for last element delete in Queue
//            if(rear==front)
//            {
//                rear = front = -1 ;
//            }else{
//                front =(front+1) % size;
//            }
//            return result;
//        }
//        public static int peek()
//        {
//            if(isEmpty())
//            {
//                System.out.println("Queue is Empty");
//                return -1;
//            }
//            return arr[front];
//        }


    // Simple Queue
//        public static boolean isEmpty() {
//            return rear == -1;
//        }
//
//        //ADD function
//        public static void addInQueue(int data) {
//            if (rear == size - 1) {
//                System.out.println("Queue is full");
//                return;
//            }
//            rear += 1;
//            arr[rear] = data;
//        }
//
//        //Remove Function
//        public static int remove() {
//            if (rear == -1) {
//                System.out.println("Queue is Empty");
//                return -1;
//            }
//            int front = arr[0];
//            for (int i = 0; i < rear; i++) {
//                arr[i] = arr[i + 1];
//            }
//            rear -= 1;
//            return front;
//        }
//
//        public static int peek() {
//            if (rear == -1) {
//                System.out.println("Queue is Empty");
//                return -1;
//            }
//            return arr[0];
//        }
//    }
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];   // 'a'-'z'
        Queue<Character> q1 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q1.add(ch);
            freq[ch - 'a']++;

            while (!q1.isEmpty() && freq[q1.peek() - 'a'] > 1) {
                q1.remove();
            }
            if(q1.isEmpty())
            {
                System.out.print(-1+" ");
            }else {
                System.out.print(q1.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }

       while(!s.isEmpty()) {
           q.add(s.pop());
       }
    }

    public static void main(String[] args) {
//        QueueS q = new QueueS();
////        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q.remove());
//        q.add(4);
//        System.out.println(q.remove());
//        q.add(5);
//
////        System.out.println(q.isEmpty());
//        while (!q.isEmpty()) {
//            System.out.println(q.peek());
//            q.remove();
//        }


        //printNonRepeatingCharacter
//        String str = "aabccxb";
//        printNonRepeating(str);

        //reverse the queue
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        reverseQueue(q);
        while(!q.isEmpty())
        {
            System.out.print(q.peek()+ " ");
            q.remove();
        }

    }
}
