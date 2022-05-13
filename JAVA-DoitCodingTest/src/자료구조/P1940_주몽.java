package 자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class P1940_주몽 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int count = 0;
		int i = 0;
		int j = N - 1;
		while (i < j) {
			if(A[i] + A[j] < M) {	// 투 포인터 이동 원칙에 따라 포인터를 이동하며 처리 
				i++;
			}else if(A[i] + A[j] > M) {
				j--;
			}else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
		br.close();
	}
}
