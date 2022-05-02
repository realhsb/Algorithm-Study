package level1;

//#12912 두 정수 사이의 합 (JAVA)

class Solution_12912 {
	  public long solution(int a, int b) {
	        long answer = 0;
	      if(a<b){
	        for(int  x = a; x<=b ; x++) {
	            answer += x;
	        }
	      }
	      else if(a>b){
	          for(int  x = a; x>=b ; x--) {
	            answer += x;
	          }
	      }else{
	          return  a;
	      }
	      return answer;
	  }
	}