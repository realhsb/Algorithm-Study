package level2;

//#42587 큐 - 프린터 (JAVA)

import java.util.Queue;
import java.util.LinkedList;

class Solution_42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = 0;
        Queue<Integer> priQue = new LinkedList<Integer>();
        int[] count = new int[9];
        
        for(int i : priorities){
            if(max < i){
                max = i;
            }
            priQue.add(i);
            count[--i]++;
        }
        
        for(int z = 0; z <= location; z++){
            int pri = priQue.peek();
            
            if(pri == max){
                int maxIndex = max - 1;
                priQue.poll();
                answer++;
                count[maxIndex]--;
                
                if(z== location){
                    break;
                }
               
                if(count[maxIndex] == 0){
                    for(int j = maxIndex; j >= 0; j--){
                        if(count[j] != 0){
                            max = j+1;
                            break;
                        }
                    }
                }
                
            }else if(pri < max){
                priQue.add(priQue.poll());
            }
            
            if(z == location){
                if(priQue.peek() <= max){
                    location += priQue.size();
                }else{
                    break;
                }
            }
        }
        return answer;
    }
}