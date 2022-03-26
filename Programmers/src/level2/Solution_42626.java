package level2;

//#42626 힙(Heap) - 더 맵게 

import java.util.PriorityQueue;

class Solution_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        //우선순위큐(Priority Queue)를 사용해서 힙(Heap) 생성
        //우선순위가 낮은 숫자부터 부여(제일 작은 숫자가 제일 위에 있음)
        //만약 우선순위가 높은 숫자부터 부여하고 싶으면 new PriorityQueue<>(Collections.reverseOrder()) 사용 
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        
        //빠른 for문을 통해 heap에 원소들 추가 
        for(int scov : scoville){
            heap.add(scov);
        }
        
        //peek()를 통해 heap에서 가장 우선순위가 높은(제일 위에 있는 원소 검색)
        //K보다 작을 시 섞어준다 
        //num1 : 가장 맵지 않은 음식의 스코빌 지수, num2 : 두 번째로 맵지 않은 음식의 스코빌 지수 
        while(heap.peek() < K){
            if(heap.size() == 1){			//전부 다 합쳤음에도 불구하고 K보다 작으면 heap에는 딱 하나의 원소만 남음(heap.size() == 0) 
                return -1;					//size가 1이므로 밑에서 연산을 진행시키면 NullPointerException이 발생됨
            }
            int num1 = heap.poll();
            int num2 = heap.poll();
            heap.add(num1 + (num2 * 2));	//섞기 
            answer++;     					//섞은 횟수
        }
        
        return answer;
    }
}