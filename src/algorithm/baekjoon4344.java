package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon4344 {
  
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringBuilder sb= new StringBuilder();
    StringTokenizer st;
    
    int c = Integer.parseInt(br.readLine());
    String[] str = new String[c];
    ArrayList<Float> temps = new ArrayList<>(); 
    float[] result = new float[c];
    
    for (int i = 0 ; i < c ; i++) {
      
      float n = 0;
      
      float sum = 0;
      float avg = 0;
      
     str[i] = br.readLine(); 
     st = new StringTokenizer(str[i]);
     
     while(st.hasMoreTokens()) {
       temps.add(Float.valueOf(st.nextToken()));
     }
     
     for (int j = 1 ; j < temps.size() ; j++) {
       sum += temps.get(j);
     }
     avg = sum / (temps.size() - 1);
     
     for (int j = 1 ; j < temps.size() ; j++) {
       if (temps.get(j) > avg) {
         n++;
       }
     }
     
     result[i] = n / (temps.size()-1) * 100;
     
     sb.append(String.format("%.3f", result[i])).append("%\n");
     temps.clear();
    }
   
    
    System.out.println(sb);
    
  }
}
