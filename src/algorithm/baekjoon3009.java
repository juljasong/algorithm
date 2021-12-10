package algorithm;

import java.util.Scanner;

public class baekjoon3009 {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      String[] str1 = sc.nextLine().split(" ");
      String[] str2 = sc.nextLine().split(" ");
      String[] str3 = sc.nextLine().split(" ");
      
      int[][] whs = {{Integer.parseInt(str1[0]), Integer.parseInt(str1[1])}, {Integer.parseInt(str2[0]), Integer.parseInt(str2[1])}, {Integer.parseInt(str3[0]), Integer.parseInt(str3[1])}};
      int[] wints = new int[1001];
      int[] hints = new int[1001];
      int w = 0;
      int h = 0;
      
      
      for (int i = 0 ; i < whs.length ; i++) {
       
        wints[whs[i][0]]++;
        
      }
      
      for (int i = 0 ; i < wints.length ; i++) {
        
        if (wints[i] == 1)
          w = i;
         
       }
      
      for (int i = 0 ; i < whs.length ; i++) {
        
        hints[whs[i][1]]++;
         
       }
      
      for (int i = 0 ; i < hints.length ; i++) {
        
        if (hints[i] == 1)
          h = i;
         
       }
      
      System.out.println(w + " " + h);
      
      
      
      
      


      
  }
}

