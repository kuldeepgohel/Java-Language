import java.util.ArrayList;
import java.util.Arrays;

public class multiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainArrayList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1;i<6;i++)
        {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
       
        mainArrayList.add(list1);
        mainArrayList.add(list2);
        mainArrayList.add(list3);

        System.out.println(mainArrayList+" ");
    }

}
