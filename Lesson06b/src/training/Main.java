package training;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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
		
		for (int i = 0; i < 1000000; i++) {
			printStat("123qwertyuiopasdfghjklzxcvbnm45,.!!");
		}

		System.out.println(t + " - " + dateFormat.format(new Date()) );
	}

	private static int countLetter(String text, char sym) {
		int count = 0;
		char[] letters = text.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == sym) {
				count++;
			}
		}

		return count;
	}

	private static void printStat(String text) {
		text = text.toLowerCase();

//		char[] letters = text.toCharArray();
//
//		Arrays.sort(letters);
//
//		for (int i = 0; i < letters.length; i++) {
//			if (letters[i] > 96 && letters[i] < 123 
//					&& (i == 0 || letters[i] != letters[i - 1])) {
//				System.out.println(letters[i] + ": " + countLetter(text, letters[i]));
//			}
//		}
		
		//Teacher's solution
		for (char let = 'a'; let <= 'z'; let++) {
			int n = countLetter(text, let);
			if (n > 0) {
				System.out.println(let + " = " + n);
			}
		}		
	}
}