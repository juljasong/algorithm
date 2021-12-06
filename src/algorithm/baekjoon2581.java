package algorithm;

import java.util.Scanner;

public class baekjoon2581 {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      int M = sc.nextInt();
      int N = sc.nextInt();

      int isPrime = 1;
      int result = 0;

      int min = Integer.MAX_VALUE;

      for (int i = M; i <= N; i++) { //범위 내의 소수 구하기

        isPrime = 1;
        
        if (i == 1) continue;
        
          //for (int j = 2; j <= Math.sqrt(i) ; j++) {
          for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
              if (i % j == 0) {
                  isPrime = -1;
                  break;
              }
          }
          
          if (isPrime == 1){//소수판정, 배열에 추가
            result += i;
            min = Math.min(min, i);
          }
          
      }

      if (result == 0){
        System.out.println(-1);
    }else{
        System.out.println(result);
        System.out.println(min);
    }
  }
}

