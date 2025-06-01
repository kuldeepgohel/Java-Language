import java.util.Stack;

public class duplicateParentheses {
    public static boolean validParentheses(String str) {
        Stack<Character> s = new Stack<>();//define stack

        for (int i = 0; i < str.length(); i++) {
            char currChr = str.charAt(i);
            //opening
            if (currChr == '(' || currChr == '{' || currChr == '[') {
                //opening
                s.push(currChr);
            } else {
                //closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && currChr == ')') //()
                        || (s.peek() == '{' && currChr == '}') //{}
                        || (s.peek() == '[' && currChr == ']')) //[]
                {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDuplicate(String str) {   //O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else { //opening, operator, operands
                s.push(ch);
            }

        }
        return false;
    }


    public static void main(String[] args) {
        String str1 = "({{}})"; //true for valid parentheses
        String str2 = "({{})"; //false for valid parentheses
        String s1 = "((a+b))";
        String s2 = "(a+b)";

//        System.out.println(validParentheses(str2));
        System.out.println(isDuplicate(s1));
    }
}
