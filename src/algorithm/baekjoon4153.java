package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon4153 {
  
  public static void main(String[] args) throws Exception {
    
      Scanner sc = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      while (true) {
        
        String str = sc.nextLine();
        
        if (str.equals("0 0 0")) break;
        
        String[] strs = str.split(" ");
        int[] ints = {Integer.parseInt(strs[0]), Integer.parseInt(strs[1]), Integer.parseInt(strs[2])};
        
        int max = 0;
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for (int i = 0 ; i < 3 ; i++) {
          max = Math.max(max, ints[i]);
        }
        
        for (int i = 0 ; i < 3 ; i++) {
          if (ints[i] != max) 
            intArr.add(ints[i]);
        }
        
        if ((max * max) == (intArr.get(0) * intArr.get(0)) + (intArr.get(1) * intArr.get(1))) {
          sb.append("right\n");
        } else {
          sb.append("wrong\n");
        }
        
        
      }


      System.out.println(sb);
      
  }
}

