package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class P17298_오큰수 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());	// 원소 개수 
		int[] A = new int[n];						// 수열 배열
		int[] ans = new int[n];						// 정답 배열 
		
		String[] str = bf.readLine().split(" ");	// 수열 배열을 저장하고 
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(str[i]);		// 타입 변환 
		}
		
		Stack<Integer> myStack = new Stack<Integer>();	// 인덱스를 저장할 스택 
		myStack.push(0);								// 처음에는 항상 스택이 비어있으므로 최초 값을 push해 초기화 
		for(int i = 1; i < n; i++) {
			// 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우 
			while(!myStack.empty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i];			// 정답 배열에 오큰수를 현재 수열로 저장하기 
			}
			myStack.push(i);						// 신규 데이터 push 
		}
		while(!myStack.empty()) {
			// 반복문을 다 돌고 나왔는데 스택이 비어 있지 않을 때 빌 때까지 반복 
			// 스택에 남아있는 인덱스가 가리키는 정답 배열에 -1을 대입 -> 오큰수를 가지고 있지 않는 인덱스 
			ans[myStack.pop()] = -1;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
			// 출력한다 
		}
		bw.write("\n");
		bw.flush();
	}
}

//예제 입력 1
//4
//3 5 2 7

//예제 출력 1
//5 7 7 -1 

//예제 입력 2
//4
//9 5 4 8

//예제 출력
//-1 8 8 -1 
