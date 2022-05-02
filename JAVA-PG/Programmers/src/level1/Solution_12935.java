package level1;

//#12935 제일 작은 수 제거하기 (JAVA)

import java.util.ArrayList;
import java.util.Collections;

class Solution_12935 {
    public ArrayList<Integer> solution(int[] arr) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int a : arr){
            answer.add(a);
        }
        
        answer.remove(Collections.min(answer));
        
        if(answer.size() == 0){
            answer.add(-1);
        }
        
        return answer;
    }
}
