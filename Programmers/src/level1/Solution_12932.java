package level1;

//#12932 자연수 뒤집어 배열로 만들기 (JAVA)

import java.util.ArrayList;

class Solution_12932 {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<Long>();

        while(n > 0){
            answer.add(n%10);
            n /= 10;
        }
        return answer;
    }
}