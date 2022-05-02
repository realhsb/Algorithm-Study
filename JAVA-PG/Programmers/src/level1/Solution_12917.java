package level1;

//#12917 문자열 내림차순으로 배치하기 (JAVA)

class Solution_12917 {
    public String solution(String s) {
        String answer;
        
        char[] s_ = s.toCharArray();
        
        for(int i = 0; i < s_.length; i++){
            char max = s_[i];
            for(int j = i + 1; j < s_.length; j++){
                if((int)max < (int)s_[j]){
                    char temp = s_[i];
                    max = s_[j];
                    s_[i] = s_[j];
                    s_[j] = temp;
                }
            }
        }
        
        answer = new String(s_);
        
        return answer;
    }
}