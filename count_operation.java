import java.util.Random;

public class count_operation {
	static long count=0;
	public static void main(String a[]) throws Exception
	{
		//long startTime = System.currentTimeMillis();

		Random rand = new Random();
		//long count;

		int [] num = new int[100000];
		
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=rand.nextInt(Integer.MAX_VALUE);
							
		}
		
		
		long startTime = System.currentTimeMillis();
		System.out.print("Before Fun");
		countsortInt(num);
		System.out.println("After Fun");
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Counter"+count);
		System.out.println("Time Taken"+ (totalTime/1000));
		System.out.println("works done by time"+ count/totalTime);

	
	
}

	public static void countsortInt(int numbers [])
	{
		int j;
        boolean flag = true;  // will determine when the sort is finished
        int temp;
        

        while ( flag )
        {
              flag = false;
              for ( j = 0;  j < numbers.length - 1;  j++ )
              {
                      if ( numbers [ j ] > numbers[ j+1 ] )
                      {                                             // ascending sort
                                  temp = numbers [ j ];
                                  numbers [ j ] = numbers [ j+1];     // swapping
                                  numbers [ j+1] = temp; 
                                  count=count+1;
                                  flag = true;
                       } 
               } 
        } 
        System.out.println("After Sorting");
        for (int k=0;k<numbers.length;k++)
        {
        	System.out.println(k);
        }
        System.out.println("Operations:" + count);
        
  } 

}
