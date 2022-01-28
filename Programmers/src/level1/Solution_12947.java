package level1;

//#12947 하샤드 수

class Solution_12947 {
    public boolean solution(int x) {
        int original = x;
        
        int sum = 0;
        while(x > 0){
            sum += (x%10);
            System.out.println("sum : " + sum);
            x /= 10;
            System.out.println("x : " + x);
        }       
        return original%sum==0;
    }
}