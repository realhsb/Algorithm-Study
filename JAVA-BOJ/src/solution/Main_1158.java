package solution;

//#1158 요세푸스 

import java.util.LinkedList;
import java.util.Scanner;
import java.lang.StringBuilder;

class Main_1158 {
	public static void main(String[] args) {
		LinkedList<Integer> LList = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("<");
		
		int N = 0;
		int K = 0;
		int index = -1;
		
		N = scan.nextInt();
		K = scan.nextInt();
		
		for(int i = 1; i <= N; i++) {
			LList.add(i);
		}
		
		while(LList.size() >= 1) {
			index += K;
			while(index > LList.size()-1) {
				index -= LList.size();
			}
			sb.append(LList.get(index));
			if(LList.size() != 1) {
				sb.append(", ");
			}
			LList.remove(index);
			index--;
		}
		sb.append(">");
		
		System.out.println(sb.toString());
	}
}
