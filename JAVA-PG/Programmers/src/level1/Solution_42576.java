package level1;

//#42576 해시 - 완주하지 못한 선수 (JAVA)

import java.util.HashMap;
import java.util.Map;

class Solution_42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> pMap = new HashMap<String, Integer>();
        
        for(String name : participant){
            pMap.put(name, (pMap.getOrDefault(name, 0) + 1));
        }
        for(String name : completion){
            pMap.put(name, (pMap.get(name)-1));
        }
        for(String name : pMap.keySet()){
            if(pMap.get(name) != 0){
                answer += name;
                break;
            }
        }
        
        return answer;
    }
}