package level1;

//#12943 콜라츠 추측 (JAVA)

class Solution_12943 {
    public int solution(long num) {
        int answer = 0;
        for(int i = 0; i <= 500; i++){
            if(i == 500){
                return -1;
            }else if (num == 1){
                return answer;
            }else{
                if(num % 2 == 0){
                    num /= 2;
                    answer++;
                }else {
                    num = num * 3 + 1;
                    answer++;
                }
            }
        }
        return answer;
    }
}