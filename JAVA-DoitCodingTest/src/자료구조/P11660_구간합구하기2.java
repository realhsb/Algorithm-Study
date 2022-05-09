package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()(); int N = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N+1][N+1];
		for(int i = 0; i < N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N+1; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] D = new int[N+1][N+1];
		for(int i = 0; i < N+1; i++) {
			for(int j = 0; j < N+1; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] + D[i-1][j-1] + A[i][j];
			}
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = st.nextToken();
			int y1 = st.nextToken();
		}
	}
}
