package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1152 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    //int N = Integer.parseInt(br.readLine());
    
    String str = br.readLine().toUpperCase();
    
    char[] chars = str.toCharArray();
    int[] aToz = new int[100];

     for (int i = 0 ; i < chars.length ; i++) {
       aToz[chars[i]]++;
     }
     
    int max = 0;
    int temp = 0;
    int cnt = 0;
     
    for (int i = 0 ; i < aToz.length ; i++) {
      int a = Math.max(aToz[i], max);
      
      if (max != a) {
        max = a;
        temp = i;
      }

    }
    
    for (int i = 0 ; i < aToz.length ; i++) {
      if (aToz[i] == max) {
        cnt++;
      }
    }
     
    if (cnt > 1) {
      System.out.println("?");
    } else {
      System.out.println((char)temp);
    }
     
  }
}
