package level1;

//#12930 이상한 문자 만들기 (JAVA)

class Solution_12930 {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        boolean check = true;
        for(int i = 0; i < charArr.length; i++){
            if(Character.isWhitespace(charArr[i])){
                check = true;
            }else {
                if(check){
                    charArr[i] = Character.toUpperCase(charArr[i]);
                }else{
                    charArr[i] = Character.toLowerCase(charArr[i]);                             
                }
                check = !(check);
            }
            
        }
        answer = new String(charArr);
        return answer;
    }
}