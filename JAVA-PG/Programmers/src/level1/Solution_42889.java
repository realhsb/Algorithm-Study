package level1;

//#42889 해시 - 실패율 (JAVA)

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution_42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        Map<Integer, Double> stageMap = new HashMap<Integer, Double>(N);
        
        for(int n = 1; n <= N; n++){
            int left = 0;
            int users = 0;
            for(int j = 0; j < stages.length; j++){ //stage 검사
                if(stages[j] >= n){
                    users++;
                    if(stages[j] == n){
                        left++;
                    }
                }
            }
            if(users == 0){
                stageMap.put(n, 0.0);
            }else {
                stageMap.put(n, (double)left/users);
            }
        }
        
        List<Integer> mapKeyList = new ArrayList<Integer>(stageMap.keySet());
        Collections.sort(mapKeyList, new Comparator<Integer>(){
            
            @Override
            public int compare(Integer i1, Integer i2){
                if(stageMap.get(i1) > stageMap.get(i2)){
                    return -1;
                }else if(stageMap.get(i1) < stageMap.get(i2)){
                    return 1;
                }
                return 0;
            }
        });
        
        int k = 0;
        for(int key : mapKeyList){
            answer[k] = key;
            k++;
        }
        
        return answer;
    }
}