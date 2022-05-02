package level2;

//#42746 ���� - ���� ū ��

import java.util.ArrayList;
import java.util.Collections;

class Solution_42746 {
    public String solution(int[] numbers) {
        
        StringBuilder answer = new StringBuilder();
        ArrayList<StringBuilder> arrayList = new ArrayList<StringBuilder>();
        
        //StringBuilder�� ����*3 �� ���ڿ� Arraylist�� ��� 
        for(int number : numbers){
            StringBuilder sb = new StringBuilder(number);
            for(int i = 0; i < 3; i++){ //�������ٰ� 2�� �� �����ִ� ��
                sb.append(number);
            }
            arrayList.add(sb);
        }
        //ArrayList �������� ����
        Collections.sort(arrayList, Collections.reverseOrder());
        
        //������ *3 �� ��ŭ /3 �����ν� ���� ���� �̾���̱� 
        for(StringBuilder sb : arrayList){
            sb = new StringBuilder(sb.substring(0, sb.length()/3));
            answer.append(sb);
        }
        
        //"0000" ���̽��� ����Ͽ� �� ���ڸ� ���ڰ� 0�� ���� ó�� 
        if(arrayList.get(0).substring(0,1).equals("0")){
            return "0";
        }
        
        //StringBuilder�� String���� ��ȯ
        return answer.toString();
    }
}