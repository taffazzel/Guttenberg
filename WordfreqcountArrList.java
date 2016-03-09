
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//long startTime = System.currentTimeMillis();

class wordlist implements Comparable<wordlist>{
	String word;
	int count=0;
	
	int getValue(){
		return count;
	}
	
	String getKey(){
		return word;
	}
	
	void putKey(String str){
		word = str;
	
	}
	
	void putValue(int i){
		count = count+i;
	}

	@Override
	public int compareTo(wordlist wl) {
		// TODO Auto-generated method stub
		return wl.count - count;
	}

	
}

public class WordfreqcountArrList {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();
		
		try{
		String wordlist;
		int freq = 1;
		int frequency = 0;
		int count=0;
		File file = new File("C:/New folder/data1.txt");
	    File file_write = new File("C:/New folder/ArrayList_tf.csv");
		File file_write_2=new File("c:/New folder/ArrayList_top10.csv");
		FileWriter fw = new FileWriter(file_write.getAbsoluteFile());
		FileWriter fw_2 = new FileWriter(file_write_2.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw_2 = new BufferedWriter(fw_2);   
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line = null;
		ArrayList<wordlist> arrlist =new ArrayList<wordlist>();
		
		Boolean flag = true;
		while((line=br.readLine())!=null)
		{

			String[] tokens = line.split("[^a-zA-Z]");
			//System.out.println(tokens);
			for (String token: tokens)
			{
				token=token.toLowerCase();
				flag = true;

				for( int i = 0; i < arrlist.size(); i++){

					if (((arrlist.get(i)).getKey()).equals(token)){
						(arrlist.get(i)).putValue(1);
						flag = false;
						break;
					}
				}
				
				if(flag){
					wordlist w = new wordlist();
					w.putKey(token);
					w.putValue(1);
					arrlist.add(w);
				}
				
			}
			//HashSet<String> unique = new HashSet<String>(arrlist);
						
		}
		System.out.println(arrlist.size());

		
		
		for (int i=0; i < arrlist.size(); i++ ){
			int j;
			for (j = i+1; j < arrlist.size(); j++){
				if(((arrlist.get(i)).getValue()) < ((arrlist.get(j)).getValue())){
					wordlist w = new wordlist();
					w = arrlist.get(i);
					arrlist.set(i,arrlist.get(j));
					arrlist.set(j, w);
				}
			}
		}
		int i = 0;
		for (wordlist w : arrlist)
		{
			if (i>10){
				break;
			}
			System.out.println(w.getKey()+ " : " + w.getValue());
			i++;
		}
			
		
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		
		
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	
	System.out.println("The time required "+ totalTime);
	
	}
	}

	

