package level3;

//#42579 해시 - 베스트앨범 (JAVA)

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution_42579 {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, Integer> totalMap = new HashMap<String, Integer>();
        Map<Integer, Integer> genreMap;
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for(int i = 0; i < genres.length; i++){         
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);       
        }
        

         List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(totalMap.entrySet());
        Collections.sort(entryList, new Comparator<Entry<String, Integer>>(){
            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });  
      
        for(Entry<String, Integer> entry1 : entryList){
            genreMap = new HashMap<Integer, Integer>();
           for(int i = 0; i < genres.length; i++){
               if(entry1.getKey().equals(genres[i])){
                   genreMap.put(i, plays[i]);

               }
           }
            
            List<Entry<Integer, Integer>> entryList2 = new ArrayList<Entry<Integer, Integer>>(genreMap.entrySet());
        Collections.sort(entryList2, new Comparator<Entry<Integer, Integer>>(){
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
            
            int count = 0;
            for(Entry<Integer, Integer> e : entryList2){
                if(count == 2){
                    break;
                }
                answerList.add(e.getKey());
                count++;
            }     
        }
        
        int[] answer = new int[answerList.size()];
        int j = 0;
        for(int num : answerList){
            answer[j] = num;
            j++;
        }
        
        return answer;
    }
}