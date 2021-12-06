package algorithm;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      String[] str = sc.nextLine().split(" ");
      long M = Long.parseLong(str[0]); // 이상
      long N = Long.parseLong(str[1]); // 이하
      long prime = 1;
      
      for (long i = M ; i <= N ; i++) {
        if (i == 1) continue;
        prime = 1;
        
        for (long j = 2 ; j <= Math.sqrt(i) ; j++) {
          if (i % j == 0) {
            prime = -1;
            break;
          }
          
        }
        if (prime == 1) {
         sb.append(i).append("\n"); 
        }
        
      }

      System.out.println(sb);
      
  }
}

