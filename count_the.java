import java.io.File; 
import java.io.*;
import java.util.*;
public class count_the {
	public static void main(String a[])throws Exception
	{
		File file = new File("C:/New folder/data.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		int count=0;
		while(sc.hasNext())
		{
		    if(sc.next().equals("the"))
		    count++;
		    else
		    continue;
		}
		System.out.println("Number of times: " + count);
	}
}
