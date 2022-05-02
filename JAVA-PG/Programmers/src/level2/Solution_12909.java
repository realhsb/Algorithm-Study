package level2;

// #12909 스택 - 올바른 괄호 

import java.util.Stack;

class Solution_12909 {
    boolean solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        
        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false; 
                }
            }else { // (
                stack.add(c);
            }
        }  
        if(!stack.isEmpty()){
            return false;
        }
        return answer;
    }
}