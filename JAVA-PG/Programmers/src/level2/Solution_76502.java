package level2;

//#76502 스택 (Stack) - 월간 코드 챌린지 시즌2 / 괄호 회전하기 (JAVA)


import java.util.Stack;

class Solution_76502 {
    public int solution(String s) {
        int answer = 0;
        
        //문자열 한 글자씩 분리하여 배열로 만들기 
        char[] cArr = s.toCharArray();
        
        for(int i = 0; i < cArr.length; i++){
        	//문자열을 돌릴 때마다 새로 스택 정의해줘야 함 
            Stack<Character> stack = new Stack<Character>();
            
            for(int j = 0; j < cArr.length; j++){
            	//인덱스가 배열의 크기보다 커져도 나머지 연산을 통해 범위 조절 
                char c = cArr[(j+i) % cArr.length];
                
                if(stack.size() > 0){	//스택이 비어있을 때 예외 처리 
                    char p = stack.peek();	//스택의 peek와 추가할 문자 비교 
                    if(p == '(' && c == ')') {
                        stack.pop();
                    }else if(p == '{' && c == '}'){
                        stack.pop();
                    }else if(p == '[' && c == ']') {
                        stack.pop();
                    }else {
                        stack.push(c);	//괄호가 닫히지 않으면 계속 추가 
                    }
                } else {		//스택이 비어있으면 push만 진행 
                    stack.push(c);
                }
            }
            if(stack.size() == 0) answer++;	//스택의 사이즈가 0이 됐을 때만 (모든 괄호가 닫혔을 때) 
        }
        return answer;
    }
}