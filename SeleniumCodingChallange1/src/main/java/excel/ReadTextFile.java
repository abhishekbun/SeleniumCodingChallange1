package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File("C:\\Users\\dell\\git\\SeleniumCodingChallange1\\SeleniumCodingChallange1\\src\\main\\java\\excel\\sample.txt");
		
		Scanner scn = new Scanner(file);
		while(scn.hasNextLine()) {
			
			String[] words = scn.nextLine().split("\\|");
			
			System.out.println(words.length);
			for(int i=0; i<words.length; i++) {
				
				System.out.print(words[i]+"  ");
				
			}
		}
		System.out.println();
		
	}
	

}
/*
 * 
 * 
 * 
 * List<String> l1 = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		Scanner scn = new Scanner(file);
		String s=null;
		String sn=null;
 * 
 * String[] data = scn.nextLine().split("|");
			System.out.println(data.length);
			for(int i=0; i<data.length;i++) {
				sn = s+s.charAt(i);
				System.out.println(sn);
			}
 * 
 * 
 * 
 */
