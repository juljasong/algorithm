package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon1316 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    int N = Integer.parseInt(br.readLine());

    ArrayList<Character> cList = new ArrayList<>();
    String[] strs = new String[N];
    int no = 0;
    int temp = 1;
    
    //String str = br.readLine();
    
    for (int i = 0 ; i < N ; i++) {
      strs[i] = br.readLine();
    }
    
    
    for (int i = 0 ; i < N ; i++) {
      
      
      char[] chars = strs[i].toCharArray();
      
      for (int j = 0 ; j < chars.length ; j++ ) {
        
        if (j < 1) {

          cList.add(chars[j]);
          
        } else {
          
          if (chars[j] != chars[j - 1]) {
            
            if (!cList.contains(chars[j])) {
              cList.add(chars[j]);
            } else {
              temp = -1;
              break;
            }
            
          }
          
        }
        
      }
      
      if (cList.size()==1 || temp == 1) {
        no++;
      }

      temp = 1;
      
      cList.clear();
      
      
    }
    
    
    System.out.println(no);
    
    
  }
}
