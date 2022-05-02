package level2;

//#12899 StringBuilder - 124 나라의 숫자 (JAVA)
 
import java.lang.StringBuilder;

class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            if(n % 3 == 1){
                sb.insert(0,1);
            }else if(n % 3 == 2){
                sb.insert(0,2);
            }else if(n % 3 == 0) {
                sb.insert(0,4);
                n--;
            }
            n /= 3;
        }
        answer = sb.toString();
        return answer;
    }
}