package level1;

//#12915 문자열 내 마음대로 정렬하기 (JAVA)

import java.util.Arrays;
import java.util.Comparator;

class Solution_12915{
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
        @Override
        public int compare(String st1, String str2) {
            int result = st1.charAt(n) - str2.charAt(n);
         
            if(result == 0){
                return st1.compareTo(str2);
            }  
            return result;
        }
        });           
        return strings;
    }
}