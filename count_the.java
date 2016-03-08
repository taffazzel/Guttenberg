import java.io.File; 
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count_the {
	public static void main(String a[])throws Exception
	{
		String word= "the";
		File file = new File("C:/New folder/data.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		Pattern p =Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
		int count=0;
		while(sc.hasNext())
		{
			String s= sc.next();
			Matcher matcher = p.matcher(s);
		    //if(s.compareToIgnoreCase("the")==0)
		    if(matcher.find())
			count++;
		    
		}
		System.out.println("Number of times: " + count);
	}
}
