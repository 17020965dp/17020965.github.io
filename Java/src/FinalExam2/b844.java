package FinalExam2;

import java.util.Stack;

public class b844 {
    public static void main(String[] args){
        String S = "ab#c";
        String T = "ad#c";
        System.out.println(backspaceCompare(S,T));
    }
    static public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }


    static public String getString(String s){
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for(int i =0;i< c.length;i++){
            if(c[i]=='#'){
                stack.pop();
            }
            else {
                stack.push(c[i]);
            }
        }
        return String.valueOf(stack);
    }
}
