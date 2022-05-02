package level2;

// #12951 - JadenCase 문자열 만들기 

class Solution_12951 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder newSb = new StringBuilder();
        boolean space_check = false;
        char c = sb.charAt(0);
        
        if(Character.isDigit(c)){
            newSb.append(c);
        }else {
            newSb.append(Character.toUpperCase(c));
        }
        
        for(int i = 1; i < sb.length(); i++){
            c = sb.charAt(i);
            if(c == ' ') {
                space_check = true;
                newSb.append(c);
            }else {
                if(space_check){
                    newSb.append(Character.toUpperCase(c));
                }else{
                    newSb.append(Character.toLowerCase(c));
                }
                space_check = false;
            }
        }
        return newSb.toString();   
    }
}