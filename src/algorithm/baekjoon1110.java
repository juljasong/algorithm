package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1110 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb= new StringBuilder();
    StringTokenizer st;
    
    String str = br.readLine();
    int n = Integer.parseInt(str); // 변경X
    int a, b;
    int newNo = 0; // 새로운 수
    int temp;
    
    int i = 0; //사이클

    newNo = n;
    
    do {
      
      if (newNo < 10) {
        
        newNo *= 11; 
        
      } else {
        
        a = Integer.parseInt((String.valueOf(newNo)).substring(0, 1));
        b = Integer.parseInt((String.valueOf(newNo)).substring(1, 2));
       
        //두 번째 수
        if (a + b > 9) { 
          temp = a + b - 10;
        } else {
          temp = a + b;
        }
        newNo = (b * 10) + temp;
      }
      
      i++;
    } while(newNo != n);
    
   
  System.out.println(i);

  }
}
