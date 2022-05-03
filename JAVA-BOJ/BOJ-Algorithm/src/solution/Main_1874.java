package solution;

//#1874 스택 수열 

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int size = 0, temp = 0;
		
		size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num > temp) {
				for(int j = temp + 1; j <= num; j++) {
					sb.append("+\n");
					stack.push(j);
				}
				temp = num;
			}else if(num != stack.peek()) {
				sb = new StringBuilder("NO");
				break;
			}
			sb.append("-\n");
			stack.pop();
		}
		System.out.println(sb.toString());
	}
}
