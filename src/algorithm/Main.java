package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    int T = Integer.parseInt(br.readLine());
    ArrayList<Long> result = new ArrayList<>();
    for (int i = 0 ; i < T ; i++) {
    
      String str = br.readLine();
      String[] temp = str.split(" ");
      long x = Long.parseLong(temp[0]);
      long y = Long.parseLong(temp[1]);
      
      long distance = y - x - 1;
      long cnt = 1;
      
      long k = 0;
      
      while (distance > 0) {
        
        if (distance > k) {
          distance -= ++k;
        } else if (distance == k) {
          distance -= k;
        } else if (distance < k){
          distance -= --k;
        }
        
        cnt++;
        
      }
      result.add((long) cnt);
      
    }
    
    for (Long o : result) {
      System.out.println(o);
    }
    
    
  }
}

