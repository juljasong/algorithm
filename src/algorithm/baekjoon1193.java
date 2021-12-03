package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon1193 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    long N = Long.parseLong(br.readLine());
    //String str = br.readLine();
    //String[] temps = str.split(" ");
    
    long temp = 1;
    long i = 1;
    long sum = 0;
    
    long a = 0;
    long b = 0;
    
    do {
      sum += i;
      i++;
    }while(sum < N);
    
    sum -= (i - 1);

    
    for (long j = 0; j < N - sum ; j++) {
      
      if (i % 2 == 0) {
        a = (i - 1) - j;
        b = (1 + j);
      } else {
        b = (i - 1) - j;
        a = (1 + j);
      }
    }
    
    System.out.println(a +"/" + b);
    

   
    
    
  }
}
