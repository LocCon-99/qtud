package qtud.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Service;

import qtud.service.SecurityService;

/**
 * @author YenCVT
 * @version 0.1
 *
 */

@Service
public class SecurityServiceImpl implements SecurityService{

  private SecretKeySpec secretKey;

  /**
   * setKey.
   * 
   * @author YenCVT.
   */

  @Override
public void setKey(String mykey) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    MessageDigest sha = null;
    byte[] key = mykey.getBytes("UTF-8");
    sha = MessageDigest.getInstance("SHA-1");
    key = sha.digest(key);
    key = Arrays.copyOf(key, 16);
    secretKey = new SecretKeySpec(key, "AES");
  }

  /**
   * encrypt.
   * 
   * @author YenCVT.
   */

  @Override
public String encrypt(String str)
      throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
      IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    setKey("e=mc2");
    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, secretKey);
    return Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes("UTF-8")));
  }

  /**
   * decrypt.
   * 
   * @author YenCVT.
   */

  @Override
public String decrypt(String str)
      throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
      IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
    setKey("e=mc2");
    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    cipher.init(Cipher.DECRYPT_MODE, secretKey);
    return new String(cipher.doFinal(Base64.getDecoder().decode(str)), "UTF-8");
  }
}
