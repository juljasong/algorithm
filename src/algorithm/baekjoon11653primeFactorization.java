package algorithm;

import java.util.Scanner;

public class baekjoon11653primeFactorization {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      long N = sc.nextInt();
      long temp = N;
      
      long i = 2;
      while(true) {
        if (N == 1) break;
        
        if (temp % i == 0) {
          temp /= i;
          sb.append(i).append("\n");
          continue;
        }
        i++;
        
        if (temp == 1) {
          break;
        }
        
      }
      System.out.println(sb);
      
  }
}

