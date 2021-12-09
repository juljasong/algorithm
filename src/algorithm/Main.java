package algorithm;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      int n = sc.nextInt();
      System.out.println(fibonacci(n));
      
  }
  
  static int fibonacci(int n) {
    
    if (n <= 1) return n;
    
    return fibonacci(n-1) + fibonacci(n-2);
  }

  
}

