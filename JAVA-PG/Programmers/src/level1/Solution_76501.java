package level1;

//#76501 월간 코드 챌린지 시즌2 - 음양 더하기 (JAVA)

class Solution_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            }else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}