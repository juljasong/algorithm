package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baekjoon10757 {
  
  public static void main(String[] args) throws Exception {
    

    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb= new StringBuilder();
    //StringTokenizer st;
    
    String str = br.readLine();
    String[] temp = str.split(" ");
    BigInteger A = new BigInteger(temp[0]);
    BigInteger B = new BigInteger(temp[1]);
    
    System.out.println(A.add(B));
    
  }
}

