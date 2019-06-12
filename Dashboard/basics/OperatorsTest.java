package basics;

import java.util.Random;

public class OperatorsTest {

	static void charTest(char x) {
		x++;
		System.out.println(x);
	}

	static void appendCharToString(char c) {
		String s = "";
		for (int i = 1; i <= 26; i++) {
			s += c;
			c++;
		}
		System.out.println(s);
	}

	public static void main(String[] args) {

//		appendCharToString('A');

		Random rand = new Random(100);

		for (int a = 0; a < 26; a++) {
			int i = rand.nextInt(26);
			System.out.println("i before +'A': " + i + " (int)a: " + (int)'A');
			i += 'A';
			System.out.println("i after +'A': " + i + " (char)i: " + (char)i);
			System.out.println();
		}

//		for (int i=0; i<=100; i++) {
//			System.out.println((char)i);
//		}
	}

}
