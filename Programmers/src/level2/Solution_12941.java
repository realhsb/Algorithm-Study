package level2;

//#12941 ArrayList - 최솟값 만들기 (JAVA)

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
    
    
class Solution_12941 {
    public int solution(int []A, int []B) {
        int answer = 0;
        
        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> bList = new ArrayList<Integer>();
        for(int a : A){
            aList.add(a);
        }
        for(int b : B){
            bList.add(b);
        }
        
        Collections.sort(aList);
        Collections.sort(bList, Comparator.reverseOrder());
        
        for(int i = 0; i < aList.size(); i++){
            answer += aList.get(i) * bList.get(i);
        }

        return answer;
    }
}