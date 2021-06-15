
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Permet de compter le nombre de chaque sympt�me La valeur de retour est une
 * chaine de caract�re � laquelle est rattach�e une valeur num�rique
 */

public class Counter {

	public Map<String, Integer> count(ArrayList<String> list) throws IOException {
		/** stocke les symptomes avec leur valeurs num�riques */

		Map<String, Integer> counter = new HashMap<String, Integer>();

		for (String i : list) {

			Integer j = counter.get(i);
			counter.put(i, (j == null) ? 1 : j + 1);

		}

		/** int�gre le nombre de symptomes dans la map */

		for (Map.Entry<String, Integer> val : counter.entrySet()) {

			System.out.println(val.getKey() + " = " + val.getValue());

		}
		return counter;

	}
}
