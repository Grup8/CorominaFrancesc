package Ex1;

import java.util.Scanner;
import java.util.Stack;

public class StackPalindrom extends Stack<Object> {
//3213213213213211233
	public static void main(String[] args) {
		String par = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entra paraula: ");
		par = scanner.nextLine();

		if (esPalindrom(par)) {

			System.out.println(par + " es palindrom");

		} else {
			System.out.println(par + " no es palindrom");

		}

	}

	public static boolean esPalindrom(String p1) {
		Stack s1 = new Stack();
		String p2 = "";

		// Emplanem l'Stack amb la caracters separats de la paraula p1 que ens
		// an entrat
		for (int i = 0; i < p1.length(); i++) {
			s1.push(p1.charAt(i));
		}

		// Concatanem tot l'stack al reves
		while (!s1.empty()) {
			p2 += s1.pop();
		}

		// Comprovacio de si la paraula es
		if (p1.equals(p2)) {
			return true;
		} else {
			return false;
		}
	}
}
