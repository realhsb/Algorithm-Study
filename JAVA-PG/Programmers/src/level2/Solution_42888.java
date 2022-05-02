package level2;

//#42888 해시 - 오픈채팅방 (JAVA)


import java.util.ArrayList;
import java.util.HashMap;


class Solution_42888 {
    public ArrayList<String> solution(String[] record) {

        ArrayList<String> chatList = new ArrayList<String>();
        HashMap<String, String> userMap = new HashMap<String, String>();

        for(String re : record){
            String[] s = re.split(" ");
            if(s[0].equals("Enter")){ // 0 : 출입 / 1 : id / 2 : 닉네임
                userMap.put(s[1],s[2]);
                chatList.add(s[1] + "님이 들어왔습니다.");
            }else if(s[0].equals("Leave")){
                chatList.add(s[1] + "님이 나갔습니다." );
            }else{
                userMap.replace(s[1],s[2]);
            }
        }
        
        int i = 0;
        for(String s_ : chatList){
            chatList.set(i, s_.replace(s_.substring(0, s_.indexOf("님")), userMap.get(s_.substring(0, s_.indexOf("님")))));
            i++;   
        }

        return chatList;
    }
}