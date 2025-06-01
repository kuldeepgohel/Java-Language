public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size; // it is used to track the size of LinkedList

    public void addFirst(int data) {
        // step-1 = create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step-2 -  newNode next= head
        newNode.next = head; // link

        //step-3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step-1 = create a new node
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
        }
        //step-2 - tail.next = newNode
        tail.next = newNode;
        //step-3 - tail= newNode
        tail = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("linkedList is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        //i = idx-1 ; temp->prev

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key)//
            {
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthNode(int n) {
        //calculate
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;//remove first
            return;
        }
        //size-n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) //first condition for even number of node and second condition is for odd number of node
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is midNode
    }

    public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }
            //step-1 : find the mid     point
            Node middleNode = findMid(head);
            //step-2 : reverse 2nd half
            Node curr = middleNode;
            Node prev = null;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;
            //step-3 :check leftHalf & rightHalf
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;

            }
            return true;
    }

    public static boolean isCycle() { //Floy's CFA
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true;//cycle exists
            }
        }

        return false;//cycle doesn't exists
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next ==null)
        {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right MergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }
    private Node getMid(Node head)
    {
        Node slow  = head ;
        Node fast = head.next;
        while(fast != null && fast.next !=null)
        {
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;//mid
    }
    private Node merge(Node head1,Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 !=null && head2 !=null)
        {
            if(head1.data <= head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1 !=null)
        {
            temp.next = head1;
            head1=head1.next;
            temp=temp.next;
        }
        while (head2 !=null)
        {
            temp.next = head2;
            head2=head2.next;
            temp=temp.next;
        }
        return  mergedLL.next;

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLinkedList();
        System.out.println();
        ll.head = ll.mergeSort(ll.head);
        ll.printLinkedList();
//        head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next= head;
//        System.out.println(isCycle());

//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.add(4, 5);
//        ll.printLinkedList();
//        System.out.println();
////        ll.removeFirst();
//        ll.printLinkedList();
//        System.out.println();
//        ll.deleteNthNode(3);
//        ll.printLinkedList();
//        ll.reverseLinkedList();
//        System.out.println(ll.size);
//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.search(10));
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(1);
//        ll.addLast(1);
//        ll.printLinkedList();
//        System.out.println();
//        System.out.println(ll.isCycle());
//        System.out.println(ll.checkPalindrome());


    }
}
