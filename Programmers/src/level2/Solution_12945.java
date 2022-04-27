package level2;

// #12945 - 피보나치 수열 

class Solution_12945 {
    public int solution(int n) {
        
        int pp = 0;
        int p = 1;
        
        for(int i = 2; i < n; i++){
            int tmp = p + pp;
            pp = p%1234567;
            p = tmp % 1234567;
        }
        
        return (p+pp)%1234567;
    }
}