package 그리디;

import java.util.Scanner;

public class P1541_잃어버린괄호 {
	static int answer = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String example = sc.nextLine();
		String[] str = example.split("-");
		for(int i = 0; i < str.length; i++) {
			int temp = mySum(str[i]);
			if(i == 0)
				answer += temp;	// 가장 앞에 있는 값만 더함 
			else
				answer -= temp;	// 뒷부분은 더한 값들을 뺌 
		}
		System.out.println(answer);
	}
	
	static int mySum(String a) {
		int sum = 0;
		String temp[] = a.split("[+]");
		for(int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		
		return sum;
	}
}

// 예제 출력 1

//100-40+50+74-30+29-45+43+11

// 예제 출력 2

//-222
