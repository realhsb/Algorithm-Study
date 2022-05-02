package level2;

import java.util.Stack;

public class Solution_12973 {
	public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            char c = charArr[i];
            if(stack.empty()){
                stack.add(c);
            }else {
                if(stack.peek() == c){
                    stack.pop();
                }else {
                    stack.add(c);
                }
            }    
        }
        
        if(stack.empty()){
            return 1;
        }else {
            return 0;
        }
    }
}
