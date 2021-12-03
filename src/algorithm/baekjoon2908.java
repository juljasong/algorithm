package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon2908 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    //int N = Integer.parseInt(br.readLine());
    
    String[] strs = br.readLine().split(" ");
    int[] nums = new int[strs.length];
    
    int max = 0;

    
    for (int i = 0 ; i < strs.length ; i++) {
      
      ArrayList<Character> chars = new ArrayList<>();
      
      for (int j = strs[i].length() - 1 ; j >= 0 ; j--) {
        
        chars.add(strs[i].charAt(j));
        
      }
      
      String temp = "";
      
      for (char c : chars) {
        temp += c;
      }
      
      nums[i] = Integer.parseInt(temp);
      
    }
    
    for (int i = 0 ; i < nums.length ; i++) {
      max = Math.max(max, nums[i]);
    }
    
    System.out.println(max);
    
    
  }
}
