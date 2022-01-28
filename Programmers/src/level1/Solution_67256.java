package level1;

//#67256 키패드 누르기 (JAVA)

import java.lang.StringBuilder;

class Solution_67256 {
    public int calDistance(int number, int left, int right){
        
        int leftD = Math.abs((number - 1) / 3 - (left - 1) / 3) + Math.abs((number - 1) % 3 - (left - 1) % 3);
        int rightD = Math.abs((number - 1) / 3 - (right - 1) / 3) + Math.abs((number - 1) % 3 - (right - 1) % 3);

        if(leftD < rightD){ //if left == 0, right == 1;
            return 0;
        }else if(leftD > rightD){
            return 1;
        }else {
            return -1;
        }
    }
    
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        
        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                left = number;
                sb.append("L");
            }else if(number == 3 || number == 6 || number == 9){
                right = number;
                sb.append("R");
            }else{ // 2, 5, 8, 0
                if(number == 0){
                number = 11;
                }
                int check = calDistance(number, left, right); 
                //if left == 0, right == 1;
                if(check == 0){ //left
                    sb.append("L");
                    left = number;
                }else if(check == 1){
                    sb.append("R");
                    right = number;
                }else{
                    if(hand.equals("left")){
                        sb.append("L");
                        left = number;
                    }else {
                        sb.append("R");
                        right = number;
                    }
                }
            }  
        }
        String answer = sb.toString();
  
        return answer;
    }
}