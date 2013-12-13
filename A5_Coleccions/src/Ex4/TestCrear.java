package Ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCrear {
	
	public static void barrejaCartes(List<Carta> baralladecartes){
		Collections.shuffle(baralladecartes);
	}
	public static void main(String[] args) {

		List<Carta> baralla = new ArrayList<Carta>();
		String[] cartes = { "AS", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K" };
		String[] pals = { "cors", "piques", "diamants", "trèvols" };

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 12; j++) {
				baralla.add(new Carta(pals[i], cartes[j]));
			}
		}
		
		
		System.out.println(baralla);	
		barrejaCartes(baralla);
		System.out.println(baralla);	
		
		
	}

}

