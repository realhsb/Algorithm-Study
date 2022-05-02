package level1;

//#12926 시저 암호 (JAVA)

class Solution_12926 {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == ' '){
                continue;
            }else {
                int c = charArr[i];
                if(Character.isUpperCase(c) && c + n > 90){
                    c = c + n - 26;
                }else if(Character.isLowerCase(c) && c + n > 122){
                    c = c + n - 26;
                }else {
                    c += n;
                }
                charArr[i] = (char)c;

            }
        }        
        return new String(charArr);
    }
}