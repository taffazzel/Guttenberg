import java.io.*;



public class Find_the {

	public static void main(String a[]) throws Exception
	{
		FileReader fr=new FileReader("C:/New folder/data.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br);
		int i=0;
		int count=0;
		while(br!= null)
		{
			System.out.println(br);
			if (str(br)=="the")
			{
				count=count+1;
			}
			else
			continue;
			
				
		}
	}

	private static String str(BufferedReader br) {
		// TODO Auto-generated method stub
		return null;
	}
}
