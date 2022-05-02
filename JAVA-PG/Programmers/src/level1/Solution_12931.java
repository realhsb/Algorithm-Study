package level1;

//#12931 자릿수 더하기 (JAVA)

public class Solution_12931 {
    public int solution(int n) {
        int answer = n % 10;
        
        if(n > 0){
            return answer + solution(n/10);
        }else {
            return answer;
        }
    }    
}