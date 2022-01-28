package level2;

//#12939 연습문제 - 최댓값과 최솟값 (JAVA)

public class Solution_12939 {
	public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");
        int min = Integer.parseInt(sArr[0]);
        int max = Integer.parseInt(sArr[0]);
        for(int i = 1; i < sArr.length; i++){
            int integer = Integer.parseInt(sArr[i]);
            if(min > integer){
                min = integer;
            }else if(max < integer){
                max = integer;
            }
        }   
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        return sb.toString();
    }
}
