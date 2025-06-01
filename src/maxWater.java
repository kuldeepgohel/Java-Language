import java.util.ArrayList;

public class maxWater {
//    public static int maxWater(ArrayList <Integer> height)
//    {
//        int maxW =0;
//        for(int i=0 ; i< height.size();i++)
//        {
//            for(int j=i+1;j< height.size();j++)
//            {
//                int h=Math.min(height.get(i),height.get(j));
//                int w = j-i;
//                int water = h*w;
//               maxW =Math.max(maxW,w);
//            }
//        }
//        return maxW;
//    }

    //2 pointer approach
    public static int maxWater(ArrayList<Integer> height) {
        int maxW = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp != rp) {
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int curWater = ht * width;
            maxW = Math.max(maxW, curWater);
            //update the pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            }
            else {
                rp--;
            }

        }
        return maxW;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxWater(height));
        ;
    }
}
