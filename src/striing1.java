import java.util.Scanner;


public class striing1 {
    public static void printString(String s) {

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static boolean plindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static void shortestPath(String str) {
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y2++;
            } else if (str.charAt(i) == 'S') {
                y2--;
            } else if (str.charAt(i) == 'W') {
                x2--;
            } else {
                x2++;
            }
        }
        double x = x2 - x1;
        double y = y2 - y1;
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(result);
    }

    public static String subString(String str, int si, int ei) {
        String subString = "";
        for (int i = si; i < ei; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    public static String compression(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count+" ";
            }

        }
        return newStr;
    }

    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String s1 = "aaabbcccdd";
        String path = "WWEENNSSWNSNWE";
        String str = "abcd";
        String str2 = new String("wxyz");
        String st = "kuldeep hareshbhai gohel";
        String fruits[] = {"banana", "apple", "mango", "kiwi"};
        System.out.println(compression(s1));

        //toUpperCase method
//        System.out.println(toUppercase(st));
//        System.out.println(st.toUpperCase());
        //string builder class
//        StringBuilder sb = new StringBuilder("");
//        for (char ch = 'a'; ch <= 'z'; ch++) {
//            sb.append(ch + " ");
//        } 
//        System.out.println(sb);
//        System.out.println(sb.length());

        //compareToIgnoreCase
//        String larger = fruits[0];
//        for (int i = 1; i < fruits.length; i++) {
//            if (larger.compareToIgnoreCase(fruits[i]) < 0) {
//                larger = fruits[i];
//            }
//        }
//        System.out.print("larger string is :"+larger);
        //string are immutable

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your name :");
//        String name = sc.nextLine();
//        System.out.println(name);
//        printString(name);
//        System.out.println(plindrome(name));
//        shortestPath(path);
//        System.out.println(st.substring(5,6)); // inbuild method
//        System.out.println(subString(st,5,6)); // user define method
    }

}
