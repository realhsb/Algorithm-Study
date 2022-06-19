package 동적계획법;

import java.util.Scanner;

public class P11726_타일채우기 {
	static long mod = 10007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] D = new long[N+1];
		
		D[1] = 1;
		D[2] = 2;
		
		for(int i = 3; i <= N; i++) {
			D[i] = (D[i-2] + D[i-1]) % mod;
		}
		System.out.println(D[N]);
	}
}
