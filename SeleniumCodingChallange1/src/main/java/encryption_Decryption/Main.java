package encryption_Decryption;

import java.io.File;

/**
 * @author Sopiro (https://goo.gl/1WFWq1)
 *
 */
public class Main
{
	public static void main(String[] args)
	{
		Encryptor en = Encryptor.getEncrypter(true);
		Decryptor de = Decryptor.getDecrypter(true);
		
		File src = new File("C:/Users/knwer/Desktop/crypt/src");
		
		en.encrypt(src, src);
//		de.decrypt(src, src);
	}
}
