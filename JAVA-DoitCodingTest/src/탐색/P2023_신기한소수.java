package 탐색;

import java.util.Scanner;

public class P2023_신기한소수 {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		DFS(2, 1);				// 일의 자리 소수는 2, 3, 5, 7이므로 4개 수에서만 시작 
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	
	static void DFS(int number, int jarisu) {
		if(jarisu == N) {		// 원하는 자리수일 때, number가 소수이면 출력 
			if(isPrime(number)) {
				System.out.println(number);
			}
			return;
		}
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 0) {		// 짝수라면 더 이상 탐색할 필요가 없음 
				continue;
			}
			if(isPrime(number * 10 + i)) {	// 소수라면 재귀 함수로 자릿수를 늘림 
				DFS(number * 10 + i, jarisu + 1);
			}
		}
	}
	
	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if(num % i == 0)
				return false;		// 나눠지면 소수가 아니므로 
		}
		return true;
	}
}

// 예제 입력 1
// 4

// 예제 출력 1
//2333
//2339
//2393
//2399
//2939
//3119
//3137
//3733
//3739
//3793
//3797
//5939
//7193
//7331
//7333
//7393
