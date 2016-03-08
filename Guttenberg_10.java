import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Guttenberg_10 {

	public static void main(String args[]) throws Exception {
		String wordlist;
		int freq = 1;
		int frequency = 0;
		File file = new File("C:/New folder/data1.txt");
		File file_write = new File("C:/New folder/tf.csv");
		FileWriter fw = new FileWriter(file_write.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		// Scanner sc = new Scanner(new FileInputStream(file));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line = null;

		HashMap<String, Integer> occurences = new HashMap<String, Integer>();
		// HashMap<String,int> occurrences = new HashMap<String,int>();
		// TreeMap<String, Integer> occurences = new TreeMap<String, Integer>();

		// System.out.println(frequency);

		while ((line = br.readLine()) != null) {
			String[] tokens = line.split("[^a-zA-Z]");
			for (String token : tokens)
			// for(int i=0;i<=length(tokens);i++)
			{
				token = token.toLowerCase();
				if (occurences.get(token) != null) {

					occurences.put(token, occurences.get(token) + 1);

				} else {
					// System.out.println(occurences.put(token, 1));

					occurences.put(token, 1);
				}
			}

		}
		for (String str : occurences.keySet()) {
			System.out.print(str + occurences.get(str) + ", " + "\n");
			bw.write(str + "," + occurences.get(str));
			bw.newLine();

			// List<Word> Index= new ArrayList<Word>();
		}
		System.out.println("Ended");

	}

	public class Word {

		String wordname = null;
		Integer count = 0;

	}

}