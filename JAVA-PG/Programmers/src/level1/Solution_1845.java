package level1;

//#1845 해시 - 폰켓몬 (JAVA)

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution_1845 {
    public int solution(int[] nums) {
        int answer = 0;
        Integer[] nums_I = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(nums_I));
        if(set.size() > (nums_I.length/2)) {
            answer = nums.length / 2;
        } else{
            answer = set.size();
        }

        return answer;
    }
}