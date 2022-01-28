package level1;

//#12910 나누어 떨어지는 숫자 배열 (JAVA)

import java.util.ArrayList;
import java.util.Collections;

class Solution_12910 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int num : arr){
            if(num % divisor == 0){
                answer.add(num);
            }
        }
        if(answer.size() == 0){
            answer.add(-1);
        }else if(answer.size() > 1){
            Collections.sort(answer);
        }
        
        return answer;
    }
}