package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon1978primeNumber {
  
  public static void main(String[] args) throws Exception {
    

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    String[] str= br.readLine().split(" ");
    int[] ints = new int[N];
    
    int isPrime = 1; // 소수 여부
    int cnt = 0;
    
    for (int i = 0 ; i < N ; i++) {
      ints[i] = Integer.parseInt(str[i]);  
    }
    
    for (int i = 0 ; i < ints.length ; i++) {
      isPrime = 1;
      if (ints[i] == 1) continue;
      
      for (int j = 2 ; j <= Math.sqrt(ints[i]) ; j++) {
        if (ints[i] % j == 0) {
          isPrime = -1;
          break;
        }
      }
      
      if (isPrime == 1) {
        //System.out.println(ints[i]);
        cnt++;
      }
      
    }
    
    System.out.println(cnt);
  }
}

