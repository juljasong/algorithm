package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon2292 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    Long N = Long.parseLong(br.readLine());
    //String str = br.readLine();
    //String[] temps = str.split(" ");
    
    Long sum = 1L;
    
    Long i = 1L;
    while (N > sum) {
      
      if (N == 1) {
        break;
      }
      
      sum += (6 * i++);
      
    }
    
    System.out.println(i);
    
  }
}
