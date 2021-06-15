
import java.util.ArrayList;
import java.util.Map;

/**
 * m�thode main afin de lancer l'ensemble du programme, les autres classes sont
 * li�es � celle-ci
 */

public class Hemebiotech {
	public static void main(String[] args) throws Exception {

		/** Cha�ne de caract�re pour stocker le chemin du fichier */
		String file = "symptoms.txt";

		/** CLASS ReadSymptomFile : lire le fichier et le mettre dans une liste */
		ReadSymptomFile readsymptomfile = new ReadSymptomFile();
		ArrayList<String> listSymptoms = readsymptomfile.read(file);

		/**
		 * CLASS Counter : comptez le nombre de chaque sympt�me et trie dans l'ordre
		 * alphab�tique
		 */
		Counter counter = new Counter();
		Map<String, Integer> counterResult = counter.count(listSymptoms);

		/**
		 * CLASS CreateFile :G�n�rez un nouveau fichier, y stocker le contenu de la Map
		 * et trier son contenu par ordre alphab�tique
		 */
		CreateFile createfile = new CreateFile();
		createfile.write(counterResult);

	}
}
