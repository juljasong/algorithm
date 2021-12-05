package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon10250 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    int T = Integer.parseInt(br.readLine());
    ArrayList<String> result = new ArrayList<>();
    
    for (int i = 0 ; i < T ; i++) {
      String str = br.readLine();
      
      String[] temps = str.split(" ");
      
      int H = Integer.parseInt(temps[0]); 
      int W = Integer.parseInt(temps[1]); 
      int N = Integer.parseInt(temps[2]); 
    
      int currentW;
      int currentH;
      
      for (currentW = 1 ; currentW <= W ; currentW++) {
        for (currentH = 1 ; currentH <= H ; currentH++) {
          N--;
          if (N == 0) {
            if (currentW < 10) {
              result.add(currentH +"0" + currentW);
            } else {
              result.add(currentH +"" + currentW);
            }
            break;
          }
          
        }
      }
      
    }
   
    for (String s : result) {
      System.out.println(s);
    }
    
  }
}

