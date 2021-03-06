package 탐색;

public class P2023_신기한소수_슈도코드 {
	N(자릿수)
	DFS 실행하기 (숫자 2, 3, 5, 7로 탐색 시작)
	//DFS 구현하기
	DFS {
		if(자릿수 == N) {
			if(소수) 수 출력하기
			탐색 종료
		}
		
		for(1 ~ 9 반복하기) {
			if(뒤에 붙는 수가 홀수이면서 소수일 때)
			DFS 실행 : 자릿수 + 1, 수 * 10 + 뒤에 붙는 수 
		}
	}
	
	// 소수 구하기 함수
	for ('2 ~ 현재 수 / 2' 반복하기) {
		if(나머지가 0이면) return 소수가 아님
	}
	return 소수임 
}
