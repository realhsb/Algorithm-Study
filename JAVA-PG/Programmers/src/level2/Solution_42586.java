package level2;

//#42586 스택/큐 - 기능개발 

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution_42586 {
    public List<Integer> solution(int[] progresses, int[] speeds) {
   
        
        List<Integer> answerList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        int max = 0;
        for(int i = 0; i < progresses.length; i++){
            
            int count = 0;
            int mod = (100 - progresses[i]) % speeds[i];
            int quo = (100 - progresses[i]) / speeds[i];
            
            if(mod == 0){
                count = quo;
            }else {
                count = quo + 1;
            }

            if(max == 0){
                max = count;
                stack.add(count);
            }else if(max >= count){
                stack.add(count);
                
            }else { //max < count  
                max = count;
                answerList.add(stack.size());
                stack.clear();
                stack.add(count);
            }  
        }
        answerList.add(stack.size());
        
        return answerList;
    }
}