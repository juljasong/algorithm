package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1065 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());
    
    System.out.println(d(N));
    
    
  }
  
  static int d(int n) {
    
    int ret = 0;
    
    for (int i = 1 ; i <= n ; i++) {
      if (i < 100) {
        ret++;
      } else {
        String[] arr = String.valueOf(i).split("");
        if ((Integer.parseInt(arr[1]) - Integer.parseInt(arr[0])) == (Integer.parseInt(arr[2]) - Integer.parseInt(arr[1]))) {
          ret++;
        }
      }
    }
    
    
    return ret;
  }
  
}
