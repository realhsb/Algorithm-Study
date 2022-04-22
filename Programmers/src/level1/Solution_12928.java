package level1;

// #12928 - 약수의 합 

class Solution_12928 {
    public int solution(int n) {
        if(n==0){
            return 0;
        }
        int answer = 0;
        boolean[] boolArr = new boolean[n+1]; // 0제외
        boolArr[0] = false; boolArr[1] = true;
        for(int i = 2; i < n+1; i++){
            boolArr[i] = true;
        }
        for(int i = 2; i <= n; i++){
            if(boolArr[i]){
                if(n%i != 0){
                    for(int j = i; j <= n; j += i){
                        boolArr[j] = false;
                    }
                }
            }
        }
        for(int i = 1; i <= n; i++){
            if(boolArr[i]){
                answer += i;
            }
        }
        return answer;
    }
}