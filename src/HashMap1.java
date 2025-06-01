import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
    // public static boolean validAagram(String s, String t)
    // {
    //     if(s.length()!= t.length())
    //     {
    //         return false;
    //     }
    //     HashMap<Character,Integer> map = new HashMap<>();
    //      for(int i=0;i<s.length();i++)
    //      {
    //          char ch = s.charAt(i);
    //          map.put(ch,map.getOrDefault(ch,0)+1); // if character is existing in map then increase the frequency otherwise add and set as a 0
    //      }
    //      for(int i =0;i<t.length();i++)
    //      {
    //          char ch = t.charAt(i);
    //          if(map.get(ch)!=null)
    //          {
    //              if(map.get(ch) == 1)
    //              {
    //                  map.remove(ch);
    //              }else {
    //                  map.put(ch,map.get(ch)-1); //set the value of character frequency
    //              }
    //          }else {
    //              return false;
    //          }
    //      }
    //     return map.isEmpty();
    // }
    public static void main(String[] args) {
        //create
       HashMap<String, Integer> h1 = new HashMap<>();
//        //insert - O(1)
       h1.put("India", 100);
       h1.put("China", 200);
       h1.put("US", 150);


        // String s ="race";
        // String t ="care";

        // System.out.println(validAagram(s,t));





        System.out.println(h1);
        // get the value
       int population = h1.get("India");
       System.out.println(population);
       System.out.println(h1.get("Koria"));

        // ContainsKey - O(1)-this method is use for check the existence of key in HashMap
       boolean isContainsKey = h1.containsKey("Koria");
       System.out.println(isContainsKey);

        // remove
       h1.remove("China");
       System.out.println(h1);

        // size
       System.out.println(h1.size());

        // isEmpty
       h1.clear(); // this method is used to delete the all key value pair in hashMap
       System.out.println(h1.isEmpty());

        // iteration in hashMap Using Set
       Set<String> Keys = h1.keySet();
       System.out.println(Keys);

       for (String k : Keys) {
           System.out.println("Keys:" + k + ", Value=" + h1.get(k));
       }


    }
}
