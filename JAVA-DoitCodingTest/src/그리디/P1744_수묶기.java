package 그리디;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;

public class P1744_수묶기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minusPq = new PriorityQueue<>();
		
		int one = 0;
		int zero = 0;
		
		for (int i = 0; i < N; i++) {
			int data = sc.nextInt();
			if(data > 1) {
				plusPq.add(data);
			}else if(data == 1) {
				one++;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
			}else if(data == 0) {
				zero++;
			}else {
				minusPq.add(data);
			}
		}
		
		int sum = 0;
		
		// 양수 처리하기 
		while(plusPq.size() > 1) {
			int first = plusPq.remove();
			int second = plusPq.remove();
			sum += (first * second);
		}
		
		if(!plusPq.isEmpty()) {
			sum += plusPq.remove();
		}
		
		// 음수 처리하기 
		while(minusPq.size() > 1) {
			int first = minusPq.remove();
			int second = minusPq.remove();
			sum += (first * second);
		}
		
		if(!minusPq.isEmpty()) {
			if(zero == 0) {
				sum += minusPq.remove();
			}
		}
		
		// 1 처리하기 
		sum += one;
		System.out.println(sum);
	}
}

// 예제 출력 1

//9
//-1
//-8
//2
//1
//3
//6
//-5
//0
//1

// 예제 출력 2

// 62
