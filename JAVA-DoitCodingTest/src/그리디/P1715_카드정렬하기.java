package 그리디;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715_카드정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			pq.add(sc.nextInt());
		}
		
		int data1 = 0;
		int data2 = 0;
		int sum = 0;
		
		while(pq.size() != 1) {
			data1 = pq.remove();
			data2 = pq.remove();
			sum += (data1 + data2);
			pq.add(data1 + data2);
		}
		System.out.println(sum);
	}
}

// 예제 입력 1
//3
//10
//20
//40

// 예제 출력 1
// 100