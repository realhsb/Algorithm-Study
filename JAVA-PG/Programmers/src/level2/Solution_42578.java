package level2;

//#42578 해시 - 위장 (JAVA)

import java.util.Map;
import java.util.HashMap;

class Solution_42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        for(String[] strArr : clothes){
            String type = strArr[1];
            hashMap.put(type, hashMap.getOrDefault(type, 0) + 1);
        }
        
        for(String key : hashMap.keySet()){
            answer *= (hashMap.get(key) + 1);
        }
        answer--;
        
        return answer;
    }
}