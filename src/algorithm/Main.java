package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    //long N = Long.parseLong(br.readLine());
    String str = br.readLine();
    String[] temps = str.split(" ");
    
    long A = Long.parseLong(temps[0]); // 낮 +A
    long B = Long.parseLong(temps[1]); // 밤 -B
    long V = Long.parseLong(temps[2]); // 높이 

   long current = 0;
   
   long day = 1;
   while (true) {
     
     current += A;
     
     if (current >= V) break;
     
     current -= B; 
     
     day++;
   }
    
   System.out.println(day);
    
  }
}
