
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Génére un nouveau fichier externe contenant la liste des symptoms en ordre
 * alphabétique sans doublons ainsi que les valeurs numériques correspondantes
 */

public class CreateFile {

	public void write(Map<String, Integer> SymptomsMap) throws IOException {

		/** créer nouveau fichier result.out */

		File newFile = new File("result.out");

		/** écrit le contenu dans un nouveau fichier */
		FileWriter writer = new FileWriter(newFile);
		/** TreeMap range la liste en ordre croissant */
		TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
		sortedSymptoms.putAll(SymptomsMap);
		/** affiche le contenu dans le nouveau fichier */
		for (Map.Entry<String, Integer> val : sortedSymptoms.entrySet()) {

			writer.write(val.getKey() + " = " + val.getValue());
			writer.write(System.lineSeparator());
			System.out.println(val.getKey() + " = " + val.getValue());
		}
		writer.flush();
		writer.close();

	}

}
