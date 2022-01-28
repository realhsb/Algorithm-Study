package level1;

//#86051 해시 - 없는 숫자 더하기 (JAVA)

import java.util.Set;
import java.util.HashSet;

class Solution_86051 {
    public int solution(int[] numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : numbers){
            set.add(num);
        }
        for(int i = 1; i <= 9; i++){
            if(set.contains(i)){
                continue;
            }else {
                answer += i;
            }
        }
        
        
        return answer;
    }
}