
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {
    static class StackQ{
        static  Queue<Integer> q1 = new LinkedList<>();
        static  Queue<Integer> q2 = new LinkedList<>();

        //isEmpty
        public static boolean isEmpty()
        {
            return q1.isEmpty   () && q2.isEmpty();
        }
        public static void push(int data)
        {
            if(!q1.isEmpty())
            {
                q1.add(data);
            }else
            {
                q2.add(data);
            }
        }
        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("Empty stack");
                return -1;
            }
            int top=-1;
            //cash-1
            if(!q1.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    top= q1.remove();
                    if(q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }

            }else {
                //case-2
                while(!q2.isEmpty())
                {
                    top= q2.remove();
                    if(q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }
            }
        return top;
        }
public static int peek()
{ if(isEmpty())
{
    System.out.println("Empty stack");
    return -1;
}
    int top=-1;
    //cash-1
    if(!q1.isEmpty())
    {
        while(!q1.isEmpty())
        {
            top= q1.remove();
            q2.add(top);
        }

    }else {
        //case-2
        while(!q2.isEmpty())
        {
            top= q2.remove();
            q1.add(top);
        }
    }
    return top;

}
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //stack implement by using linked list
    static class stackL {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop() {

            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    //stack implement by using arraylist
    static class stackA {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {

            list.add(data);
        }

        //pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }


    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }



    public static void main(String[] args) {
        StackQ s = new StackQ();
//        Stack<Integer> s = new Stack<>(); //java collection framework
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }


//        String str ="Hello world";
//        System.out.println( reverseString(str));
//        reverseStack(s);
//        printStack(s);
//        pushAtBottom(s, 4);

        //find next greater element
//        int arr[] = {2,4,3,1,5,2};
//        Stack<Integer> s1 = new Stack<>();
//        int nextGreater[] = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            //1 while
//            while (!s1.isEmpty() && arr[s1.peek()] <= arr[i]) {
//                s1.pop();
//            }
//            //2 if-else
//            if (s1.isEmpty())
//            {
//                nextGreater[i] = -1 ;
//            }
//            else {
//                nextGreater[i]=arr[s1.peek()];
//            }
//            //3 push element in stack
//            s1.push(i);
//        }
//
//        for (int i=0;i<nextGreater.length ;i++)
//        {
//            System.out.print(nextGreater[i]+" ");
//        }
//        System.out.println();

    }
}
