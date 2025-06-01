import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {

        //java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //add - time complexity= O(1)
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        //swap element based on index
//        int idx1 = 1, idx2 = 4;
//        System.out.println(list);
//        swap(list, idx1, idx2);
//        System.out.println(list);
//        System.out.println(list);
//
//        //get elements O(1)
//        int element = list.get(2);
//        System.out.println(element);
//
//        //delete
//        list.remove(2);
//        System.out.println(list);

//        //set element
//        list.set(2,10);
//        System.out.println(list);

//        //contains
//        System.out.println(list.contains(2));
//        System.out.println(list.contains(10));
//        System.out.println(list.contains(111));
        //maximum element of arrayList
//        int max = Integer.MIN_VALUE;
//        for(int i=list.size()-1;i>=0;i--)
//        {
//         if(list.get(i)>max)
//         {
//             max=list.get(i);
//         }
//        }
//        System.out.print(max);
    }
}
