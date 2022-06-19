package 동적계획법;

import java.util.Scanner;

public class P1463_1로만들기 {
	static int N;
	static int[] D;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		D = new int[N+1];
		D[1] = 0;
		for(int i = 2; i <= N; i++) {
			D[i] = D[i-1] + 1;
			if(i%2==0) D[i] = Math.min(D[i], D[i/2]+1);
			if(i%3==0) D[i] = Math.min(D[i], D[i/3]+1);
		}
		System.out.println(D[N]);
	}
}

// 예제 입력 1
// 10

// 예제 출력 1
// 3

// 예제 입력 2
// 2

// 예제 출력 2
// 1
