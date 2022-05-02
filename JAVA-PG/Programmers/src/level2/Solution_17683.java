package level2;

// #17683 KAKAO - [3차] 방금그곡 

import java.util.StringTokenizer;

class Solution_17683 {
    public int calTime (int start1, int start2, int end1, int end2){        
        return  (end1 * 60 + end2) - (start1 * 60 + start2);
    }
    
    public String replaceMelody(String m){
        m = m.replaceAll("C#", "c");
        m = m.replaceAll("D#", "d");
        m = m.replaceAll("F#", "f");
        m = m.replaceAll("G#", "g");
        m = m.replaceAll("A#", "a");
        return m;
    }
    
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        String title = "";
        String melody = "";
        int max_time = -1;
        StringBuilder sb_melody = new StringBuilder();
        
        m = replaceMelody(m);
        
        for(String info : musicinfos){
            sb_melody.delete(0,sb_melody.length());
            StringTokenizer st = new StringTokenizer(info, ":,");
            
            int time = calTime(Integer.parseInt(st.nextToken()),
                               Integer.parseInt(st.nextToken()),
                               Integer.parseInt(st.nextToken()), 
                               Integer.parseInt(st.nextToken())); 
            title = st.nextToken(); melody = replaceMelody(st.nextToken());
            
            int length = melody.length();
            
            char[] cArr = melody.toCharArray();
            int a = 0;
            
            for(int i = 0; i < time; i++){
                sb_melody.append(cArr[a%length]);
                a++;
            } 
            
            if(sb_melody.indexOf(m) > -1 && max_time < time){
                answer = title;
                max_time = time;
            }
        }
        if(max_time == -1){
            return "(None)";
        }else {
            return answer;
        }
    }
}