package level1;

//#72410 2021 KAKAO - 신규아이디 추천 (JAVA)

import java.util.ArrayList;
import java.util.List;

class Solution_72410 {
    public char[] level1(char[] charArr){
        for(int i = 0; i < charArr.length; i++){
            char c = charArr[i];
            if(Character.isUpperCase(c)){
                charArr[i] = Character.toLowerCase(c);
            }
        }
        return charArr;
    }
    
    public List<Character> level2(char[] charArr){
        ArrayList<Character> charList = new ArrayList<Character>();
        for(int i = 0; i < charArr.length; i++){
            char c = charArr[i];
            if(Character.isLowerCase(c)){
                charList.add(c);
            }else if(Character.isDigit(c)){
                charList.add(c);
            }else if(c == '-' || c == '_' || c == '.'){
                charList.add(c);
            }else {
                continue;
            }
        }        
        return charList;
    }
    
    public List<Character> level3(List<Character> charList){
        for(int i = 0; i < charList.size() - 1; i++){
            if(charList.get(i) == '.'){
                for(int j = i + 1; j < charList.size(); j++){
                    if(charList.get(j) == '.'){
                        charList.remove(j);
                        j--;
                    }else {
                        break;
                    }
                }
            }   
        }
        return charList;
    }
    
    public List<Character> level4(List<Character> charList){
        if(charList.get(0) == '.'){
            charList.remove(0);
        }else if(charList.get(charList.size() - 1) == '.'){
            charList.remove(charList.size() - 1);
        }
        
        return charList;
    }
    
    
    
    public String solution(String new_id) {        
        String answer = "";
        char[] charArr = new_id.toCharArray();
        List<Character> charList = new ArrayList<Character>();
        
        //1단계 lowerCase
        charArr = level1(charArr);
        
        //2단계 소문자 숫자 - _ . 외의 문자 제거
        charList = level2(charArr);
        
        //3단계 연속된 . 를 하나의 . 로 치환
        if(charList.contains('.')){
            charList = level3(charList);
        }
        
        //4단계 처음과 끝의 . 제거
        if(charList.contains('.')){
            charList = level4(charList);
        }
        
        //5단계 빈 문자열이면 "a" 대입
        if(charList.size() == 0){
            charList.add('a');
        }
        
        //6단계 길이 15개까지 조정
        if(charList.size() > 15){
            charList = charList.subList(0,15);
        }
        if(charList.get(charList.size() - 1) == '.'){
            charList.remove(charList.size() - 1);
        }
        
        while(charList.size() < 3){
            charList.add(charList.get(charList.size() - 1));
        }
        

        for(char c : charList){
            answer += ""+c;
        }
        
        return answer;
    }
}