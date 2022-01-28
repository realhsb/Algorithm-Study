package level1;

//#68644 월간 코드 챌린지 시즌1 - 두 개 뽑아서 더하기 (JAVA)

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

class Solution_68644 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> numSet = new HashSet<Integer>();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int a = numbers[i]+numbers[j];
                //numbers 에 0이 2번 포함되면 answer에도 0이 있어야 함
                numSet.add((Integer)a);

            }
        }

        List<Integer> numList = new ArrayList<Integer>(numSet);
        Collections.sort(numList);

        answer = new int[numList.size()];

        for(int i = 0; i < numList.size(); i++){
                answer[i] = numList.get(i);
        }
        return answer;
    }
}