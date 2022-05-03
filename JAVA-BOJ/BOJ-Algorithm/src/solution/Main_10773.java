package solution;

//#10773 제로

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
	public static void main(String[] args) throws IOException{
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		int sum = 0;
		
		count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				int p = stack.pop();
				sum -= p;
			}else {
				stack.add(num);
				sum += num;
			}
		}
		System.out.println(sum);
	}
}