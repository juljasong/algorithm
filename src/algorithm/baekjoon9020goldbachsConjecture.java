package algorithm;

import java.util.Scanner;

public class baekjoon9020goldbachsConjecture {
  
  static int isPrime = 1;
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      int T = sc.nextInt();

      for (int a = 0 ; a < T ; a++) {
        
        int n = sc.nextInt();
        int x = Integer.MAX_VALUE;
        int y = 0;
        
        for (int i = 2 ; i < n ; i++) {
          
          isPrime = 1;
          
          getPrime(i);
          
          if (isPrime == 1) {

            int minus = n - i;
            getPrime(minus);
            
            if (isPrime == 1) {
              if (Math.abs(x - y) > Math.abs(i - minus)) {
                x = i;
                y = minus;
              }
            }
            
          }
          
        }

        sb.append(x + " " + y + "\n");
        
      }
      
      System.out.println(sb);
      
  }

  private static void getPrime(int i) {
    
    for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
      if (i % j == 0) {
        isPrime = -1;
        break;
      }
    }
    
  }
}

