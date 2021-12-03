package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2941 {
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    //int N = Integer.parseInt(br.readLine());
    
    String str = br.readLine();
    
    //c=, c-, dz=, d-, lj, nj, s=, z=
    String[] strs = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    
    for (int i = 0 ; i < strs.length ; i++) {
      str = str.replaceAll(strs[i], "*");
    }
    
    System.out.println(str.length());
    
  }
}
