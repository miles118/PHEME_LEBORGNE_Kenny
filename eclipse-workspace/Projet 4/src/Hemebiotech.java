
import java.util.ArrayList;
import java.util.Map;

/**
 * méthode main afin de lancer l'ensemble du programme, les autres classes sont
 * liées à celle-ci
 */

public class Hemebiotech {
	public static void main(String[] args) throws Exception {

		/** Chaîne de caractère pour stocker le chemin du fichier */
		String file = "symptoms.txt";

		/** CLASS ReadSymptomFile : lire le fichier et le mettre dans une liste */
		ReadSymptomFile readsymptomfile = new ReadSymptomFile();
		ArrayList<String> listSymptoms = readsymptomfile.read(file);

		/**
		 * CLASS Counter : comptez le nombre de chaque symptôme et trie dans l'ordre
		 * alphabétique
		 */
		Counter counter = new Counter();
		Map<String, Integer> counterResult = counter.count(listSymptoms);

		/**
		 * CLASS CreateFile :Générez un nouveau fichier, y stocker le contenu de la Map
		 * et trier son contenu par ordre alphabétique
		 */
		CreateFile createfile = new CreateFile();
		createfile.write(counterResult);

	}
}
