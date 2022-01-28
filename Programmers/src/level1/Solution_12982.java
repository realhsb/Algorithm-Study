package level1;

//#12982 예산 (JAVA)

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution_12982{
    public int solution(int[] d, int budget) {
        int answer = 0;         
        
        List<Integer> ansList = new ArrayList<Integer>(d.length);
        
        for(int d_ : d){
            ansList.add(Integer.valueOf(d_));
        }
        
        while(budget > 0){
            int min = Collections.min(ansList);
            if(budget < min){
                break;
            } else{
                answer++;
                budget -= min;
                if(ansList.size() == 1){
                    return answer;
                }else {
                    ansList.remove(Integer.valueOf(min));
                }
            }
        }
        return answer;
    }
}
