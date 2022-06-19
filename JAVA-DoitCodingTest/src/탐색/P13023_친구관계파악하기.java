package 탐색;

import java.util.*;

public class P13023_친구관계파악하기 {
	static boolean visited[];			// 방문 기록 저장 배열 
	static ArrayList<Integer>[] A;		// 그래프 데이터 저장 인접 리스트 
	static boolean arrive;				// 도착 확인 변수 
	public static void main(String[] args) {
		int N;
		int M;
		arrive = false;
		
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();		// 노드 개수 
		M = scan.nextInt();		// 에지 개수 
		A = new ArrayList[N];	// 그래프 데이터 저장 인접 리스트 
		visited = new boolean[N];
		
		for(int i = 0; i < N; i++) {		// 리스트 초기화 
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			int S = scan.nextInt();		
			int E = scan.nextInt();
			A[S].add(E);			// 양방향 에지이므로 더해주기 
			A[E].add(S);
		}
		
		for(int i = 0; i < N; i++) {
			DFS(i, 1);				// depth가 1부터 시작 
			if(arrive)
				break;
		}
		if(arrive)
			System.out.println("1");
		else
			System.out.println("0");				// 5의 길이가 없다면 0 출력 
	}
	public static void DFS(int now, int depth) {	// DFS 구현 
		if(depth == 5 || arrive) {					// depth가 5가 되면 프로그램 종료 
			arrive = true;
			return;
		}
		visited[now] = true;
		for (int i: A[now]) {
			if(!visited[i]) {
				DFS(i, depth + 1);	// 재귀 호출이 될 때마다 depth를 1씩 증가 
			}
		}
		visited[now] = false;
	}
}

// 예제 입력 2
//5 5
//0 1
//1 2
//2 3
//3 0
//1 4

// 예제 출력 2
// 1