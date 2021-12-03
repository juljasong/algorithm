package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon1712 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    //int N = Integer.parseInt(br.readLine());
    String str = br.readLine();
    String[] temps = str.split(" ");
    
    double A = Double.parseDouble(temps[0]); // 고정비용
    double B = Double.parseDouble(temps[1]); // 가변비용
    double C = Double.parseDouble(temps[2]); // 노트북가격
    

    double breakPoint = -1L;
    
    if (B < C) {
      breakPoint =  A / (C - B) + 1;
      
    }
    
    System.out.println((int)breakPoint);
    
    
    
    
    
  }
}
