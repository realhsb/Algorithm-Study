package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class P11659_구간합구하기 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader 
      = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer stringTokenizer 
      = new StringTokenizer(bufferedReader.readLine());
    int suNo = Integer.parseInt(stringTokenizer.nextToken());
    int quizNo = Integer.parseInt(stringTokenizer.nextToken());
    long[] S = new long[suNo + 1];
    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
    for (int i = 1; i <= suNo; i++) {
      S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
    }
    for (int q = 0; q < quizNo; q++) {
      stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      int i = Integer.parseInt(stringTokenizer.nextToken());
      int j = Integer.parseInt(stringTokenizer.nextToken());
      System.out.println(S[j] - S[i - 1]);
    }
  }
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class P11659_구간합구하기 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int suNo = Integer.parseInt(st.nextToken()); 
//		int quizNo = Integer.parseInt(st.nextToken());
//		long[] S = new long[suNo + 1];
//		
//		st = new StringTokenizer(br.readLine());
//		for(int i = 1; i <= suNo; i++) {
//			S[i] = S[i - 1] + Integer.parseInt(br.readLine());
//		}
//		
//		for(int q = 0; q < quizNo; q++) {
//			st = new StringTokenizer(br.readLine());
//			int i = Integer.parseInt(st.nextToken());
//			int j = Integer.parseInt(st.nextToken());
//			System.out.println(S[j] - S[i-1]);
//		}
//	}
//}
