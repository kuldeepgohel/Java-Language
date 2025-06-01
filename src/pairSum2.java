import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target)
    {
        //find pivot point
        int n = list.size();
        int  bp = -1 ;
        for(int i=0 ; i< list.size();i++)
        {
            if(list.get(i)> list.get(i+1))
            {
                bp=i;
                break;
            }
        }
        int lp=bp+1; //smallest
        int rp=bp;//largest

        while(lp!=rp)
        {
            if(list.get(lp)+ list.get(rp) == target)
            {
                return true;
            } else if (list.get(lp)+ list.get(rp) < target) {
                lp = (lp+1)%n;
            }
            else {
                rp=(n+rp-1)%n;
            }
            {

            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int target = 11;
        System.out.println(pairSum(list,target));;
    }
}
