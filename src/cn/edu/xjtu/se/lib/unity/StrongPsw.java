package cn.edu.xjtu.se.lib.unity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class StrongPsw {
	public static String getMD5(String pwd) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("SHA");//SHA 或者 MD5
	    BASE64Encoder  base = new BASE64Encoder ();
	    String pwdAfter = base.encode(md.digest(pwd.getBytes()));
	    return pwdAfter;
	}
}
