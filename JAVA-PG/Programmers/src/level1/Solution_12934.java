package level1;

//#12934 정수 제곱근 판별 (JAVA)

class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long num1 = (long)Math.sqrt(n);
        double num2 = Math.sqrt(n);
        if(num1 == num2){
            answer = (long)Math.pow(num1+1, 2);
        }
        
        return answer;
    }
}