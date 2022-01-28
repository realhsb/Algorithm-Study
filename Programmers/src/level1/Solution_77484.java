package level1;

//#77484 해시 - 로또의 최고 순위와 최저 순위 (JAVA)

import java.util.Set;
import java.util.HashSet;

class Solution_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeros = 0;
        int count = 0;
        int max = 0;
        int min = 0;
        Set<Integer> lottoSet = new HashSet<Integer>();
        for(int num : win_nums){
            lottoSet.add(num);
            
        }
        
        
        for(int lotto : lottos){
            if(lotto == 0){
                zeros++;
            }
            else if(lottoSet.contains(lotto)){
                count++;
            }
        }
        
        
        if(count == 0 && zeros == 0){
            max = 6;
            min = 6;
        }else{
            if(count < 2){
                min = 6;
            }else {
                 min = 7 - count;
            }
            max = 7 - (zeros + count);
        }

        answer[0] = max;
        answer[1] = min;
        
        
        return answer;
    }
}
