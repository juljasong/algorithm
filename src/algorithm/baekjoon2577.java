package algorithm;

import java.util.Scanner;

public class baekjoon2577 {
  
  // 숫자의 개수
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int a, b, c;
    String result;
    int[] arr = new int[10];
    
    
    //System.out.print("A = ");
    a = sc.nextInt();
    
    //System.out.print("B = ");
    b = sc.nextInt();
    
    //System.out.print("C = ");
    c = sc.nextInt();
    
    result = String.valueOf(a * b * c);
    
    for (int i = 0 ; i < result.length() ; i++) {
      int j = Integer.parseInt(String.valueOf(result.charAt(i)));
      arr[j]++;
    }  
    
    for (int i = 0 ; i < 10 ; i++) {
      System.out.println(arr[i]);
    }
    
    
    
  }

}
