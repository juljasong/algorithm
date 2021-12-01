package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon8958 {
  
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb= new StringBuilder();
    StringTokenizer st;
    
    int n = Integer.parseInt(br.readLine());
    String arr[] = new String[n];
    int result[] = new int[n];
    
    int temp = 0;
    int sum = 0;
    
    for (int i = 0 ; i < n ; i++) {
      arr[i] = br.readLine();
    }
    
    for (int i = 0 ; i < n ; i++) {

      for (int j = 0 ; j < arr[i].length() ; j++) {
        if (String.valueOf(arr[i].charAt(j)).equals("O")) {
          sum += ++temp;
        } else {
          temp = 0;
        }
        
      }
      result[i] = sum;
      sum = 0;
      temp = 0;
      
      sb.append(result[i]).append("\n");
    }
    
    System.out.println(sb);
    
  }
}
