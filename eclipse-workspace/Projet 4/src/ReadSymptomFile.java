
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** Permet de lire le fichier Symptoms et de stocker son contenu */

public class ReadSymptomFile {
	public ArrayList<String> read(String document) throws IOException {
		ArrayList<String> listSymptoms = new ArrayList<String>();

		if (document != null) {

			BufferedReader br = new BufferedReader(new FileReader(document));
			String line = br.readLine();

			while ((line = br.readLine()) != null) {

				/** affiche le résultat dans la console */
				System.out.println(line);

				/** ajoute les symptômes dans la nouvelle list */
				listSymptoms.add(line);
			}

			/** affiche le résultat dans la console */
			System.out.println(listSymptoms);

			br.close();
		}
		return listSymptoms;
	}

}
