package 동적계획법;

import java.util.Scanner;

public class P14501_퇴사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] D = new int[N+2];
		int[] T = new int[N+1];
		int[] P = new int[N+1];
		for(int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		for(int i = N; i >= 1; i--) {
			if(i+T[i] > N + 1) {
				D[i] = D[i+1];
			}else {
				D[i] = Math.max(D[i+1], D[i+T[i]] + P[i]);
			}
		}
		System.out.println(D[1]);
	}
}

// 예제 입력 1

//7
//3 10
//5 20
//1 10
//1 20
//2 15
//4 40
//2 200

// 예제 출력 1
// 45           
