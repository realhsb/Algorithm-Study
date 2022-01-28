package level1;

//#12922 수박수박수박수박수박수? (JAVA)

class Solution_12922 {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                answer += "수";
            }else {
                answer += "박";
            }
        }
        return answer;
    }
}