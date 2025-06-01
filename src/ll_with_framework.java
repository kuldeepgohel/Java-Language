import java.util.LinkedList; //JCF
public class ll_with_framework {

    public static void main(String[] args) {
        //create-Object class
        LinkedList <Integer> ll= new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0); //0->1->2
        System.out.println(ll);
        //remove
        ll.removeFirst();
        System.out.println(ll);
    }
}
