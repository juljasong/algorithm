package algorithm;

import java.util.Arrays;

public class Test {
  
  public static void main(String[] args) {
    
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    boolean[] selfNumber = new boolean[10001];
    Arrays.fill(selfNumber, true);
    
    for (int i = 1 ; i < selfNumber.length ; i++) {
      int notSelfNumber = d(i);
      
      if (notSelfNumber > 10000) 
        continue;
      
      selfNumber[notSelfNumber] = false;
    }
    
    
    for (int i = 1 ; i < selfNumber.length ; i++) {
      if(selfNumber[i]) {
        sb.append(i).append("\n");
      }
    }
    
    
    System.out.println(sb);
    
  }
 
  static int d(int n) {
    
    int ret = n;
    
    while (n != 0) {
      ret += n % 10;
      n = n / 10;
    }
    
    return ret;
  }
      
}
