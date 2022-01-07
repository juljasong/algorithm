package test;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES256 {
  
  public static String alg = "AES/CBC/PKCS5Padding";
  private final static String KEY = "01234567890123456789012345678901";
  private final static String IV = KEY.substring(0, 16); // 16byte

  public static String encrypt(String text) throws Exception {
      Cipher cipher = Cipher.getInstance(alg);
      SecretKeySpec KEYSpec = new SecretKeySpec(KEY.getBytes(), "AES");
      IvParameterSpec ivParamSpec = new IvParameterSpec(IV.getBytes());
      cipher.init(Cipher.ENCRYPT_MODE, KEYSpec, ivParamSpec);

      byte[] encrypted = cipher.doFinal(text.getBytes("UTF-8"));
      return Base64.getEncoder().encodeToString(encrypted);
  }
  
  public static String decrypt(String cipherText) throws Exception {
    Cipher cipher = Cipher.getInstance(alg);
    SecretKeySpec KEYSpec = new SecretKeySpec(KEY.getBytes(), "AES");
    IvParameterSpec ivParamSpec = new IvParameterSpec(IV.getBytes());
    cipher.init(Cipher.DECRYPT_MODE, KEYSpec, ivParamSpec);

    byte[] decodedBytes = Base64.getDecoder().decode(cipherText);
    byte[] decrypted = cipher.doFinal(decodedBytes);
    return new String(decrypted, "UTF-8");
}
  
  public static void main(String[] args) {
    
    try {
    
    String name = "송율리아";
    String enName = encrypt(name);
    System.out.println("encrypted name: " + enName);
    
    String decName = decrypt(enName);
    
    System.out.println("Decrypted name: " + decName);
    
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }

}
