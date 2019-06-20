package training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text;
		
		//
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String t = dateFormat.format(date);
		//

//		System.out.print("Input text line: ");
//		text = scanner.nextLine();

//		printStat(text);
//		printStat("123qwertyuiopasdfghjklzxcvbnm45,.!!");
		
		for (int i = 0; i < 1000000; i++) {
			printStat("123qwertyuiopasdfghjklzxcvbnm45,.!!");
		}

		System.out.println(t + " - " + dateFormat.format(new Date()) );
	}

	private static void printStat(String text) {
		
		int[] letterStats = countLetters(text.toLowerCase());
		
		for (int i = 0; i < letterStats.length; i++) {
			if (letterStats[i] > 0) {
				System.out.println((char)(i + 'a') + ": " + letterStats[i]);
			}
		}		
	}
	
	private static int[] countLetters(String text) {
		
		int[] letterStats = new int['z' - 'a' + 1];
		char[] letters = text.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >= 'a' && letters[i] <= 'z') {				
				letterStats[letters[i] - 'a']++;
			}
		}		
		
		return letterStats;
	}
}