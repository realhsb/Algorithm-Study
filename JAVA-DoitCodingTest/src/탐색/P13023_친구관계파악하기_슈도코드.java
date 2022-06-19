package 탐색;

public class P13023_친구관계파악하기_슈도코드 {
	N(노드 개수) M(에지 개수)
	A(그래프 데이터 저장 인접 리스트)
	visited(방문 기록 저장 배열)
	arrive(도착 확인 변수)
	for(M의 개수만큼 반복하기) {
		A 인접 리스트의 각 ArrayList 초기화하기
	}
	for(N의 개수만큼 반복하기	) {
		각 노드마다 DFS 실행하기 
		if(arrive) 반복문 종료		// depth가 5에 도달한 적이 있으면
	}
	if(arrive) 1 출력
	else 0 출력
	
	// DFS 구현하기
	DFS {
		if(깊이가 5 || arrive) {
			arrive = true;
			함수 종료
		}
		방문 배열에 현재 노드 방문 기록하기
		현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기 (호출마다 depth는 1씩 증가)
	}
	
}
