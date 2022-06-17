package 그리디;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class P1931_회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		
		Arrays.sort(A, new Comparator<int[]>() {
			@Override
			public int compare(int[] S, int[] E) {
				if(S[1] == E[1]) {	// 종료 시각 같을 때 
					return S[0] - E[0];		// 시작 시각이 빠른 순서로 정렬 
				}else {
					return S[1] - E[1];
				}
			}
		});
		
		int count = 0;
		int end = -1;
		for (int i = 0; i < N; i++) {
			if(A[i][0] >= end) {
				end = A[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}

// 예제 입력 1

//11
//1 4
//3 5
//0 6
//5 7
//3 8
//5 9
//6 10
//8 11
//8 12
//2 13
//12 14

// 예제 출력 2

// 4