package level1;

//#12933 정수 내림차순으로 배치하기 (JAVA)

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Collections;

class Solution_12933 {
    public long solution(long n) {
        String str = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        
        long answer = 0;
        
        String[] strArr = str.split("");
        Arrays.sort(strArr, Collections.reverseOrder());
        
        
        for(String s : strArr){
            sb.append(s);
        }
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}