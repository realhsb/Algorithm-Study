package level1;

//#12948 핸드폰 번호 가리기 (JAVA)

class Solution_12948 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++){
            if(phone_number.length() - i < 5){
                answer += phone_number.charAt(i);
            }else {
                answer += "*";
            }
        }     
        return answer;
    }
}