package level1;

//#12925 문자열을 정수로 바꾸기 (JAVA)

class Solution_12925{
    public int solution(String s) {
        int answer = 0;
        
        char c = s.charAt(0);
        if(Character.isDigit(c)){
            answer = Integer.parseInt(s);
        } else{
            if(c == '-'){
                answer = - Integer.parseInt((s.substring(1)));
            }else {
                answer = Integer.parseInt(s.substring(1));
            }
        }        
        return answer;
    }
}