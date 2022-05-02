package level1;

//#64061 2019 KAKAO - 크레인 인형뽑기 게임 (JAVA)

import java.util.ArrayList;

class Solution_64061 {
    public int pop(ArrayList<Integer> line){
        int doll = line.remove(line.size() - 1);
        return doll;
    }
    
    public boolean checkResult(ArrayList<Integer> result) {
    	boolean check = false;
    	
    	if(result.get(result.size() - 1).equals(result.get(result.size() - 2))) {
    		check = true;
    		for(int i = 0; i < 2; i++) {
    			result.remove(result.size() - 1);
    		}
    	}
    	return check;
    }
    
    
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<ArrayList<Integer>> newBoard = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        
        for(int i = 0; i < board.length; i++){      //세로
            ArrayList<Integer> column = new ArrayList<Integer>();
            for(int j = board[i].length - 1; j >= 0; j--){//가로
                if(board[j][i] != 0){
                    column.add(board[j][i]);
                }
            }
            newBoard.add(column);
        }
        
        for(int k = 0; k < newBoard.size(); k++) {
        	for(int j = 0; j < newBoard.get(k).size(); j++) {
        	}
        }
        
        for(int move : moves){
        	int doll = 0;
        	if(newBoard.get(move -1 ).size() == 0) {
        		continue;
        	}
        	else if(move > 0){
                doll = pop(newBoard.get(move - 1));
                result.add(doll);

                for(int l = 0; l < result.size(); l++) {
                }

                if(doll != 0 && result.size() > 1) {
                	boolean a = checkResult(result);
                	if(a) {
                		answer += 2;
                	}
                }
            }
        }      
        return answer;
    }
}