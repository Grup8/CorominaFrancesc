package Ex3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ParaulesIguals {
	public static void main(String[] args) {
		HashMap<String, Integer> comptadors = new HashMap<String, Integer>();
		
		String[] arrayParaules = { "Algu", "Pop", "Pilotilla", "Pilota",
				"Romba", "Toyota", "Swag", "Meme", "Java", "Rom", "Majordom",
				"Xavier", "Oli", "Algu", "Pop", "Java", "Java" };

		for (String aux : arrayParaules) {

			if (comptadors.containsKey(aux)) {
				comptadors.put(aux, comptadors.get(aux) + 1);
			} else {
				comptadors.put(aux, 1);
			}
		}
		//Ordenem el Hasmap, convertint-lo amb Treempa(que te l'ordena automaticament)
		TreeMap ordenat = new TreeMap(comptadors);
		
		Set<Entry<String, Integer>> entrades = ordenat.entrySet();
		Iterator<Entry<String, Integer>> llistat = entrades.iterator();
		Entry<String, Integer> entrada;

		
		while (llistat.hasNext()) {
			entrada = llistat.next();
			System.out.println(entrada.getKey() + " :: " + entrada.getValue());

		}
	}

}
