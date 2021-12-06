package algorithm;

import java.util.Scanner;

public class baekjoon1085 {
  
  static int isPrime = 1;
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      int x = sc.nextInt(); 
      int y = sc.nextInt();
      int w = sc.nextInt(); // 절대
      int h = sc.nextInt(); // 절대
      
      int temp = Integer.MAX_VALUE;

      if (temp > w - x) {
        temp = w - x;
      } 
      
      if (temp > x) {
        temp = x;
      } 

      if (temp > h - y) {
        temp = h - y;
      } 
      
      if (temp > y) {
        temp = y;
      }
      
      
      System.out.println(temp);
      
      
  }

  
}

