import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Guttenberg_10 {

	public static void main(String args[]) throws Exception {
		String wordlist;
		int freq = 1;
		int frequency = 0;
		File file = new File("C:/New folder/data1.txt");
		File file_write = new File("C:/New folder/tf.csv");
		File file_write_2=new File("c:/New folder/top10.csv");
		FileWriter fw = new FileWriter(file_write.getAbsoluteFile());
		FileWriter fw_2 = new FileWriter(file_write_2.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw_2 = new BufferedWriter(fw_2);
		// Scanner sc = new Scanner(new FileInputStream(file));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line = null;

		HashMap<String, Integer> occurences = new HashMap<String, Integer>();
		// HashMap<String,int> occurrences = new HashMap<String,int>();
		// TreeMap<String, Integer> occurences = new TreeMap<String, Integer>();

		// System.out.println(frequency);

		while ((line = br.readLine()) != null)
		{
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

			
		}
	System.out.println("Ended Frequency counting and starting sorting");

	
	Map<String, Integer> sortedOccurences = 
				occurences.entrySet().stream()
		    .sorted(Map.Entry.comparingByValue())
		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		                              (e1, e2) -> e1, LinkedHashMap::new));
	ArrayList <Map.Entry<String,Integer>> list = new ArrayList<>(sortedOccurences.entrySet());
	for( int i = list.size() -1; i >= list.size() -11 ; i --){
		Map.Entry<String, Integer> current = list.get(i);
		System.out.print( current.getKey() + ", " + current.getValue() + "\n");
		bw_2.write(current.getKey() + ", " + current.getValue() + "\n");
		bw_2.newLine();
	}
	
	}
}