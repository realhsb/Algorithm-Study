package level1;

//#12906 같은 숫자는 싫어 (JAVA)

import java.util.*;

public class Solution_12906 {
    public ArrayList<Integer> solution(int []arr) {
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int a : arr){
            if(answer.size() == 0){
                answer.add(a);
            }else if(answer.get(answer.size() -1) == a){
                continue;
            }else{
                answer.add(a);
            }
        }
        return answer;
    }
}