package level1;

//#12944 평균 구하기 (JAVA)

class Solution_12944 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int num : arr){
            answer += num;
        }        
        return answer / arr.length;
    }
}