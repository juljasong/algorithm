package algorithm;

import java.util.Scanner;

public class baekjoon3053 {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
     double r = sc.nextInt();
     
     System.out.printf("%f\n", Math.PI * r * r);
     System.out.printf("%f\n", 2 * r * r);
      
  }
}

