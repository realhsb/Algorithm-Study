package level1;

//#12916 문자열 내 p와 y의 개수 (JAVA)

class Solution_12916 {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;        
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c == 'p') || (c == 'P')){
                countP++;
            }else if((c == 'y')|| (c == 'Y')){
                countY++;
            }
        }

        return countP == countY;
    }
}