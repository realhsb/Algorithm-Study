package level1;

//#42748 K번째 수 (JAVA)

import java.util.Arrays;
import java.util.ArrayList;

class Solution_42748 {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int[] command : commands){
            System.out.println("command : " + command[0]);
            int[] newArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(newArr);
            answer.add(newArr[command[2]-1]);
        }                            
        return answer;
    }
}
