
import java.io.*;
import java.util.*;

class Solution {

    static int bracketMatch(String text) {
        char[] arr = text.toCharArray();
        int count = 0;
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='(')
                stack.push(arr[i]);
            else {
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    count++;
            }
        }
        return count+stack.size();
    }

    public static void main(String[] args) {
        String text = "))))";
        System.out.println(bracketMatch(text));
    }
}
