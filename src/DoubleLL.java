public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("doubly linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val =head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast() {
        if (head == null) {
            System.out.println("doubly linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val =head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void print() {
        Node temp = head;
        System.out.print("null" + "<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void reverse()
    {
        Node curr = head;
        Node prev=null;
        Node next;

        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println();
        dll.reverse();

        dll.print();
        System.out.println();
        System.out.println(dll.size);
    }
}
