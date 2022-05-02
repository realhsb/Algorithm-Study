package level1;

//#12969 직사각형 별찍기 (JAVA)

import java.util.Scanner;

public class Solution_12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String star = "";

            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    star += '*';
                }
               star += "\n"; 
             }  
             
        System.out.println(star);
    }
}