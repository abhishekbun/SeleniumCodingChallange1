package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {
	
public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File("src\\main\\java\\csv\\sample.csv");
		
		Scanner scn = new Scanner(file);
		while(scn.hasNextLine()) {
			
			String[] words = scn.nextLine().split(",");
			
			System.out.println(words.length);
			for(int i=0; i<words.length; i++) {
				
				System.out.print(words[i]+"  ");
				//System.out.println(words[0]+words[1]+words[2]+words[3]+words[4]+words[5]+words[6]);
				
			}
		}
		System.out.println();
		
	}

}
