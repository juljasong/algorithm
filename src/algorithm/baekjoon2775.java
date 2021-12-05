package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon2775 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    int T = Integer.parseInt(br.readLine());
    
    ArrayList<Integer> result = new ArrayList<>();
    
    for (int i = 0 ; i < T ; i++) {
      
      int k = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      
      int[][] temp = new int[k+1][n+1];
      
      for (int j = 0 ; j <=  k ; j++) { // k
        
        for (int l = 1 ; l <= n ; l++) { // n
          
          if (j == 0) {
            temp[j][l] = l;
          } else if (l == 1){
            temp[j][l] = 1;
          } else {
            temp[j][l] = temp[j-1][l] + temp[j][l-1];
          }
          
        }
        
      }
      result.add(temp[k][n]);
    }
   
    for (Object o : result) {
      System.out.println(o);
    }
    
  }
}
