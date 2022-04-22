package level1;

// #12921 - 소수찾기 

class Solution_12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] boolArr = new boolean[n+1];
        boolArr[0] = false; boolArr[1] = false;
        for(int i = 2; i < n+1; i++){
            boolArr[i] = true;
        }
        
        for(int i = 2; i*i <= n; i++){
            if(boolArr[i]){
                for(int j = i*i; j <= n; j += i){
                    boolArr[j] = false;
                }
            }
        }
        for(int i = 2; i < n+1; i++){
            if(boolArr[i]){
                answer += 1;
            }
        }
        return answer;
    }
}