package level2;

//#42842 완전 탐색 - 카펫 

class Solution_42842 {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = {0,0};
        
        for(int i = 1; i <= yellow/2 + 1; i++){
            
            if(yellow % i == 0){
                int width = yellow / i;
                int vertical = i;
                
                if(((width + 2) * (vertical + 2) - yellow)== brown){
                    answer[0] = width + 2;
                    answer[1] = vertical + 2;
                    
                    return answer;
                }
            }
        }
        return answer;
    }
}