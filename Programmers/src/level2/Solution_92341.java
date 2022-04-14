package level2;

//#92341 2022 KAKAO - 주차 요금 계산 

import java.util.StringTokenizer;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution_92341 {    //0 : 기본 시간 1 기본 요금 2 단위 시간 3 단위 요금
    public int calTime(Integer[] in, Integer[] out){
        return (out[0] * 60 + out[1]) - (in[0] * 60 + in[1]); 
    }
    
    public int calFee(int min, int[] fees){
        if(min <= fees[0]){
            return fees[1];
        }else {
            double ceil = Math.ceil((double)(min - fees[0]) / (double)fees[2]);
            return fees[1] + (int)ceil * fees[3];
        }
    }
    
    public List<Integer> solution(int[] fees, String[] records) {
        Integer[] close_time = {23, 59};
        int num = 0; int min = 0;
        String status = "";        
        
        Map<Integer, Integer[]> recMap = new HashMap<>();
        Map<Integer, Integer> feeMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        
        for(String record : records){
            Integer[] time = new Integer[2];
            StringTokenizer st = new StringTokenizer(record, " :");
            time[0] = Integer.parseInt(st.nextToken()); time[1] = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken()); status = st.nextToken();

            if(status.equals("IN")){
                recMap.put(num, time);
            }else{
                min = calTime(recMap.get(num), time);
                recMap.remove(num);
                feeMap.put(num, feeMap.getOrDefault(num, 0) + min);
                
            }
        }

        for(Integer n : recMap.keySet()){
            int m = calTime(recMap.get(n), close_time);
            feeMap.put(n, feeMap.getOrDefault(n, 0) + m);
        }
        
        
        for(Integer f : feeMap.keySet()){
            int fee = 0;
            fee = calFee(feeMap.get(f), fees);
            
            feeMap.replace(f, fee);
        }
        
        Object[] mapKey = feeMap.keySet().toArray();
        Arrays.sort(mapKey);
        for(Object key : mapKey){
            answer.add(feeMap.get(key));
        }

        return answer;
    }
}