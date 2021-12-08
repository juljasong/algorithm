package algorithm;

import java.util.Scanner;

public class baekjoon10872fac {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      int n = sc.nextInt();
      System.out.println(factorial(n));
      
  }
  
  static int factorial(int n) {
    
    if (n < 2) {
      return 1;
    }
    
    return factorial(n-1) * n;
  }

  
}

