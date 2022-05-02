package level2;

//#42577 해시 - 전화번호 목록 (JAVA)

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Solution_42577 {
    public boolean solution(String[] phone_book) {
        
        Set <String> phoneSet = new HashSet<String>();
        for(String phone : phone_book){
            phoneSet.add(phone);
        }
        
        Iterator<String> it = phoneSet.iterator();
        
        while(it.hasNext()){
            String s = it.next();
            for(int i = 0; i < s.length(); i++){
                if(phoneSet.contains(s.substring(0,i))){
                    return false;
                }
            }
        }    
        
        return true;
    }
}