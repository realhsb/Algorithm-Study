package level1;

//#68935 3진법 뒤집기 (JAVA)

import java.util.ArrayList;
import java.lang.Math;

class Solution_68935 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> trit = new ArrayList<Integer>();
        
        while(n > 0){
            trit.add(n % 3);
            n /= 3;
        }
        
        for(int i = 0; i < trit.size(); i++){
            answer += trit.get(i) * Math.pow(3,trit.size() - i - 1);
        }
        
        return answer;
    }
}