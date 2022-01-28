package level1;

//#42840 해시 - 모의고사 (JAVA)

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;


class Solution_42840 {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(3);
        
        for(int num = 1; num <= 3; num++){
            map.put(num,0);
        }
        
        for(int i = 0; i < answers.length; i++){
            int num = answers[i];
            if(num == p1[i % p1.length]){
                map.put(1,(map.get(1)+1));
            }
            if(num == p2[i % p2.length]){
                map.put(2,(map.get(2)+1));
            }
            if(num == p3[i % p3.length]){
                map.put(3,(map.get(3)+1));
            }
        }
        
        int max = Collections.max(map.values());

        int j = 0;
        
        for(int k = 1; k <= 3; k++){
            if(max == map.get(k)){
                answer[j] = k;
                j++;
            }
        }
        answer = Arrays.copyOfRange(answer, 0, j);
        
        return answer;
    }
}