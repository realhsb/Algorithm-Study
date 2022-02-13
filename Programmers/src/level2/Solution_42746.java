package level2;

//#42746 정렬 - 가장 큰 수

import java.util.ArrayList;
import java.util.Collections;

class Solution_42746 {
    public String solution(int[] numbers) {
        
        StringBuilder answer = new StringBuilder();
        ArrayList<StringBuilder> arrayList = new ArrayList<StringBuilder>();
        
        //StringBuilder로 정수*3 한 문자열 Arraylist에 담기 
        for(int number : numbers){
            StringBuilder sb = new StringBuilder(number);
            for(int i = 0; i < 3; i++){ //기존에다가 2번 더 더해주는 것
                sb.append(number);
            }
            arrayList.add(sb);
        }
        //ArrayList 내림차순 정렬
        Collections.sort(arrayList, Collections.reverseOrder());
        
        //위에서 *3 한 만큼 /3 함으로써 원래 정수 이어붙이기 
        for(StringBuilder sb : arrayList){
            sb = new StringBuilder(sb.substring(0, sb.length()/3));
            answer.append(sb);
        }
        
        //"0000" 케이스를 대비하여 맨 앞자리 숫자가 0인 예외 처리 
        if(arrayList.get(0).substring(0,1).equals("0")){
            return "0";
        }
        
        //StringBuilder를 String으로 변환
        return answer.toString();
    }
}