package level2;

import java.util.LinkedList;
import java.util.Queue;

//#42583 스택/큐 - 다리는 지나는 트럭 

class Solution_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;	//트럭 이동 횟수 
        int index = 0;	//truck_weights의 인덱
        
        Queue<Integer> queue = new LinkedList<>();
        
        //다리 길이 - 1 만큼의 0을 queue에 추가, 나머지 한 칸에는 첫 번째 트럭이 올라감 
        for(int i = 0; i < bridge_length - 1; i++){
            queue.add(0);
        }
        
        //첫 번째 트럭이 다리 위로 올라가면서, 총 무게, 이동 횟수, 인덱스 증가 
        queue.add(truck_weights[0]);
        int sum = truck_weights[0];
        answer++; index++;
        
        //큐가 완전히 비워질 때까지 반복 (0까지 다 사라져야 함)
        while(!queue.isEmpty()){
        	//매 턴마다 맨 앞에 있는 트럭 or 0이 삭제됨, 시간이 지났으므로 answer++
            sum -= queue.poll();
            answer++;
            
            //인덱스가 유효한 범위인지 확인(트럭이 다 올라가고 나면 truck_weights를 더이상 순회할 수 없음
            //이때는 이미 올라간 트럭 or 0을 poll 하기만 하고 밑에 조건들은 무시 
            if(truck_weights.length > index) {
            	
            	//트럭이 더 올라도 제한 무게를 버티는지 확인 
                if(sum + truck_weights[index] <= weight){
                	//버틸 수 있다면 다리에 트럭 추가 
                    queue.add(truck_weights[index]);
                    sum += truck_weights[index++];
                }else {
                	//그렇지 못한다면 트럭 대기 및 0 추가 (0은 트럭이 없다는 뜻)
                    queue.add(0);
                }
            }
        }
        return answer;
    }
}