package level1;

//#12937 짝수와 홀수 (JAVA)

class Solution_12937 {
    public String solution(int num) {
        if(num % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}