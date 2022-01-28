package level1;

//#12954 x만큼 간격이 있는 n개의 숫자 (JAVA)

import java.util.ArrayList;

class Solution_12954 {
    public ArrayList<Long> solution(long x, int n) {
        ArrayList<Long> answer = new ArrayList<Long>();
        
        for(int i = 0; i < n; i++){
            answer.add(x + i * x);
        }
        return answer;
    }
}