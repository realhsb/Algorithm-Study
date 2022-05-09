package 자료구조;

public class P2018_연속된자연수의합_슈도코드 {
	N 변수 저장
	사용 변수 초기화(count = 1, start_index = 1, end_index = 1, sum = 1)
	while(end_index != N) {
		if(sum == N) count 증가, end_index 증가, sum 값 변경 
		else if(sum > N) sum 값 변경, start_index 증가
		else if(sum < N) end_index 증가, sum 값 변경 
	}
	count 출력하기 
}
