package level1;

//#17681 2018 KAKAO - 비밀지도(JAVA)

class Solution_17681 {
    public String[] convert2toSharp(int[][] map){
        String[] answer = new String[map[0].length];
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < map.length; i++){
            sb.setLength(0);
            for(int j = 0; j < map.length; j++){
                if(map[i][j] == 0){
                    sb.append(" ");
                }else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;        
    }
    
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] map = new int[n][n];
        
        for(int i = 0; i < n; i++){
            int num1 = arr1[i];
            int num2 = arr2[i];
            int[] line = new int[n];
            for(int j = n - 1; j >= 0; j--){

                int mod1 = num1 % 2;
                int mod2 = num2 % 2;
                if(mod1 != mod2){
                    line[j] = 1;        // # == 1
                    
                }else if ((mod1 + mod2) == 0){
                    line[j] = 0;
                }else if((mod1 + mod2) == 2){
                    line[j] = 1;
                }
                
                num1 /= 2;
                num2 /= 2; 
            }
            map[i] = line;
            
        }
   
        return convert2toSharp(map);
    }
}