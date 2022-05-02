package level1;

//#12903 가운데 글자 가져오기 (JAVA)

class Solution_12903 {
    public String solution(String s) {
        int size = s.length();
        if(size % 2 == 0){
            return s.substring(size/2 -1,size/2+1);
        }else {
            return s.charAt(size/2) + "";
        }
    }
}