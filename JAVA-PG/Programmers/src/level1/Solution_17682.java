package level1;

//#17682 2018 KAKAO - 다트 게임 (JAVA)

import java.util.ArrayList;
import java.lang.Math;

class Solution_17682 { 

    public int solution(String dartResult) {
        int answer = 0;

        String[] dartArr = dartResult.split("");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num = 1;
        for(int i = 0; i < dartArr.length; i++){

            String s = dartArr[i];
            if(s.equals("S")){
                nums.add((int)Math.pow(num,1));
            }else if(s.equals("D")){
                nums.add((int)Math.pow(num,2));
            }else if(s.equals("T")){
                nums.add((int)Math.pow(num,3));
            }else if(s.equals("*")){
                if(nums.size() > 1){
                    for(int k = nums.size() - 2; k < nums.size(); k++){
                        nums.set(k, nums.get(k) *2);
                    }
                }else{
                    nums.set(0, nums.get(0) * 2);
                }
            }else if(s.equals("#")){
                nums.set(nums.size() - 1, nums.get(nums.size() - 1) * (-1));
            }else{
                if((dartArr[i] + dartArr[i+1]).equals("10")){
                    num = 10;
                    i++;
                }else {
                num = Integer.parseInt(s);
                }
            }
        }
        
        for(int n : nums){
            answer += n;
        }
        
        return answer;
    }
}