package 동적계획법;

import java.util.Scanner;

public class P2193_이친수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[][] D = new long[N+1][2];
		D[1][1] = 1;	// 1자리 이친수는 1개 (1)
		D[1][0] = 0;	// 이친수는 0으로 시작하지 않음 
		
		for(int i = 2; i < N+1; i++) {
			D[i][0] = D[i-1][1] + D[i-1][0];
			D[i][1] = D[i-1][0];		// 이친수는 1이 연속으로 2개 이상 포함되어 있지 않음 ( 11 이 포함 X) 
		}
		System.out.println(D[N][0] + D[N][1]);
	}
}
