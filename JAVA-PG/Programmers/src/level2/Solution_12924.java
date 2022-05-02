package level2;

// #12924 - 숫자의 표현 (JAVA) 

class Solution_12924 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int head = 0; int tail = 0;
        while(tail <= n){
            if(sum > n){ // sum이 n보다 커질 경우 sum보다 작아질 때까지 빼주기 
                sum -= (++head);
                continue;
            }else if(sum == n){ // sum == n
                answer++;
            }
            // 1씩 늘려가며 숫자 더해주기 
            sum += (++tail);  
        }
        return answer;
    }
}
