package Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2{

	public static void main(String[] args) {

		// Array de contactes
		Contacte[] AgendaDeContactes = { new Contacte ("Joan", "Perat", "So","97212315","joanps@gtmail.do"),
										 new Contacte ("Ramon", "Tort", "Sa","97222312","tree@gtmail.do"),
										 new Contacte ("Pere", "Fuste", "Se","97224456","fusteh@gtmail.do"),
										 new Contacte ("Albert", "Font", "Si","9722277","bert123@gtmail.do"),
										 new Contacte ("Berta", "Gabi", "Su","97229898","hellyou@gtmail.do") };
		
		for (Contacte p : AgendaDeContactes) {
			System.out.println(p);
		}
		Arrays.sort(AgendaDeContactes);
		System.out.println("ORDENATS: ");
		for (Contacte p : AgendaDeContactes) {
			System.out.println(p);
		}
	}

}
