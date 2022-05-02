package level2;

public class Solution_62048 {
	public int gcd (int w, int h){
        if(w % h == 0){
            return h;
        }else {
            return gcd(h, w % h);
        }
    }
    
    public long solution(int w, int h) {
        long answer = 1;
        
        int gcd = gcd(w,h);
        answer = (long)w * h - gcd * ((w / gcd) + (h / gcd) - 1);
        
        return answer;
    }
}
