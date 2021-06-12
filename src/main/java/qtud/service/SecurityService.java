package qtud.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public interface SecurityService {

	/**
	   * setKey.
	   * 
	   * @author YenCVT.
	   */

	void setKey(String mykey) throws NoSuchAlgorithmException, UnsupportedEncodingException;

	/**
	   * encrypt.
	   * 
	   * @author YenCVT.
	   */

	String encrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException;

	/**
	   * decrypt.
	   * 
	   * @author YenCVT.
	   */

	String decrypt(String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException;

}