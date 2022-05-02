package level2;

// #42747 정렬 - H-Index

import java.util.Arrays;

class Solution_42747 {
    public int solution(int[] citations) {
        int max = Arrays.stream(citations).max().getAsInt();
        int[] counting = new int[max+1];
        
        for(int i = 0; i < citations.length; i++){
            counting[citations[i]]++;
        }
        for(int i = counting.length - 1; i > 0; i--){
            counting[i - 1] += counting[i];
            
        }
		// System.out.println("counting[]");
		// for(int i = 0; i < counting.length; i++) {
		// 	if(i % 10 == 0) System.out.println();
		// 	System.out.print(counting[i] + "\t");
		// }
		// System.out.println("\n\n");
        
        int h = -1;
        for(int i = 0; i < counting.length; i++){
            if(i <= counting[i]){
                h = i;
            }
        }
        return h;
    }
}