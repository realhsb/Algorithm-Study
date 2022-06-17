package 그리디;

public class P1541_잃어버린괄호_슈도코드 {
	answer(정답 변수)
	들어온 데이터를 "-" 기호를 기준으로 split() 수행하기
	for(나눠진 데이터 개수만큼 반복하기) {
		결괏값 = mySum() 함수 수행하기
		if(가장 앞 데이터일 때) answer에 결괏값 더하기 
		else answer에 결괏값 빼기 
	}
	answer 출력하기
	
	mySum() 함수 구현하기 {
		현재 들어온 String 값을 "+" 기호 기준으로 split() 수행하기 
		for(나눠진 데이터 개수만큼 반복하기) {
			String 값을 Integer형으로 변환해 리턴 값에 더하기 
		}
		전체 합 리턴하기 
	}
}
