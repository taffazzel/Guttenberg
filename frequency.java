import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;



public class frequency {
		
	public static void main(String args[])throws Exception
	{
		String wordlist;
		int frequency=0;
		File file=new File("C:/New folder/data.txt");
		File file_write = new File("C:/New folder/tf.csv");
		FileWriter fw = new FileWriter(file_write.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		//Scanner sc = new Scanner(new FileInputStream(file));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line=null;
		
		/*while(sc.hasNext()) 
		{
            //if(sc.next())
			
			frequency=frequency+1;
			line=sc.next();
			System.out.println(line);
            
        }*/
		
		HashMap<String,Integer> occurences = new HashMap<String, Integer>();
		//HashMap<String,int> occurrences = new HashMap<String,int>();
	    //TreeMap<String, Integer> occurences = new TreeMap<String, Integer>();

		//System.out.println(frequency);
		
		
		while((line=br.readLine())!=null)
		{
			String [] tokens=line.split("\\s+");
			for(String token:tokens)
			{
				if(occurences.containsKey(token))
				{
					//System.out.println(token+","+occurences.put(token,occurences.get(token)+1));
					bw.write(token+","+occurences.put(token,occurences.get(token)+1));
					//occurences.put(token,occurences.get(token)+1);
					
				}
				else
					//System.out.println(occurences.put(token, 1));
				occurences.put(token, 1);
			}
		}
		
	}
		
}
