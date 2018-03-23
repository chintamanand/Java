/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encryption;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.*;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;   


public class Encryption {
    public String encrypted;
   public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String Withput Spaces");
        System.out.println("Enter the String to Encrypt: ");
        String clean=scan.next();
        
        byte[] plainText  = clean.getBytes("UTF-8");
        System.out.println("After Converting the PlainText into bytes: "+plainText);
        
        String encrypted=encrypt(clean);
        System.out.println("Encryption: "+encrypted);
        
        String Decrypted=decrypt(encrypted);
        System.out.println("Decryption: "+Decrypted);
    }

    private static String encrypt(String clean) throws Exception {
                        Key key= generateKey();
                        // byte[] keyValue = key.getBytes();
      			//Key keys = new SecretKeySpec(keyValue, "AES");
      			Cipher c = Cipher.getInstance("AES");
      			c.init(Cipher.ENCRYPT_MODE, key);
      			byte[] cipherText = c.doFinal(clean.getBytes("UTF-8"));
                        return Base64.getEncoder().encodeToString(cipherText);
    }
     private static String decrypt(String clean) throws Exception {
     Key key=generateKey();
     Cipher c=Cipher.getInstance("AES");
     c.init(Cipher.DECRYPT_MODE,key);
     byte[] dec= new BASE64Decoder().decodeBuffer(clean);
     //byte[] decryptText= new Base64.Decoder.decodeToStringclean);
     byte[] decryptText = c.doFinal(dec);
        return new String(decryptText);
     
     }
    private static Key generateKey() throws Exception {
        //this is the secret Key
        String key = "ef50a0nf2c3a3n5d";
        byte [] key1=key.getBytes();
        System.out.println("After Converting the Key into bytes: "+key1);
        return new SecretKeySpec(key1, "AES");
    }
    
    
    }
    

