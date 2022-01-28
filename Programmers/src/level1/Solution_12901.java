package level1;

//#12901 2016년 (JAVA)

class Solution_12901 {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        int[] days = 
            new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 1; i <= a; i++){
            if(i == a){
                day += b;
                System.out.println("a : " + i);
                break;
            } else {
                day += days[i-1];
            }
        }

        day = day % 7;

        if(day == 0){
            answer = "THU";
        }else if(day == 1){
            answer = "FRI";
        }else if(day == 2){
            answer = "SAT";
        }else if(day == 3){
            answer = "SUN";
        }else if(day == 4){
            answer = "MON";
        }else if(day == 5){
            answer = "TUE";
        }else if(day == 6){
            answer = "WED";
        }
        
        return answer;
    }
}