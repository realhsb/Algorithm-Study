package 자료구조;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Deque;

public class P11003_최솟값찾기 {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N : 숫자의 개수, L : 슬라이딩 윈도우 크기 
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.remove();
			}
			mydeque.add(new Node(now, i));
			
			
			// 범위(슬라이딩 윈도우 크기)에서 벗어난 값은 덱에서 제거
			if(mydeque.getFirst().index <= i - L) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
	
	static class Node {
		public int value;
		public int index;
		
		Node (int value, int index){
			this.value = value;
			this.index = index;
		}
	}
}

// 예제 입력 1
// 12 3
// 1 5 2 3 6 2 3 7 3 5 2 6

// 예제 출력 1
// 1 1 2 2 2 2 2 2 3 3 2 2
