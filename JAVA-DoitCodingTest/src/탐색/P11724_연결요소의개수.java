package 탐색;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class P11724_연결요소의개수 {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// 배열리스트 배열을 선언해서 인접 노드 정리 
		A = new ArrayList[n+1];
		
		// 각 노드의 방문 여부 확인 배열 
		visited = new boolean[n+1];
		
		// 인접 리스트 초기화 
		for(int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			A[s].add(e);		// 양방향 에지이므로 양쪽에 에지 더하기 
			A[e].add(s);
		}
		int count = 0;
		for (int i = 1; i < n + 1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		
		visited[v] = true;
		for(int i : A[v]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
}

// 예제 입력 1
//6 5
//1 2
//2 5
//5 1
//3 4
//4 6

// 예제 출력 1
// 2

// 예제 입력 2
//6 8 
//1 2
//2 5
//5 1
//3 4
//4 6
//5 4
//2 4
//2 3

// 예제 출력 2
// 1
