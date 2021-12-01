package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10809 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    //int N = Integer.parseInt(br.readLine());
    
    String str = br.readLine();
    char[] charArr = str.toCharArray();
    int re = -1;

    for (int i = 'a' ; i < 'z' ; i++ ) {
      
      for (int j = 0 ; j < charArr.length ; j++) {
        if ((char)i == charArr[j]) {
          sb.append(j).append(" ");
          re = 1;
          break;
        } 
      }
      if (re == -1) {
        sb.append("-1 ");
      }
      re = -1;
      
    }
    System.out.println(sb);
    
    
  }
  

}
