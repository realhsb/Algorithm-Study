package level1;

//#81301 2021 KAKAO - 숫자 문자열과 영단어 (JAVA)

class Solution_81301 {
    public int solution(String s) {
        int answer = 0;
        String[] numArr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numArr.length; i++){
            if(s.contains(numArr[i])){
                s = s.replaceAll(numArr[i], i+"");
                System.out.println(numArr[i]);
            }
        }

        answer = Integer.parseInt(s);
        
        return answer;
    }
}