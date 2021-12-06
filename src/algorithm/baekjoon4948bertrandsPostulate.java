package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon4948bertrandsPostulate {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      ArrayList<Integer> nos = new ArrayList<>();
      int isPrime = 1;
      
      while (true) {
        int temp = sc.nextInt();
        if (temp == 0) {
          break;
        }
        nos.add(temp);
      }
      
      for (int n : nos) {
        int cnt = 0;
         
        for (int i = n + 1 ; i <= 2 * n ; i++) {
          isPrime = 1;
          
          for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
            if (i % j == 0) {
              isPrime = -1;
              break;
            }
          }
          if (isPrime == 1) {
            cnt++;
          }
        }
        
        sb.append(cnt).append("\n");
        
      }
        

     System.out.println(sb);
      
  }
}

