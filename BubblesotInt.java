import java.math.*;
import java.util.Random;


public class BubblesotInt {
	
		public static void main(String a[]) throws Exception
		{
			//long startTime = System.currentTimeMillis();

			Random rand = new Random();

			int [] num = new int[10000];
			
			
			for(int i=0;i<num.length;i++)
			{
				num[i]=rand.nextInt(Integer.MAX_VALUE);
								
			}
			
			
			long startTime = System.currentTimeMillis();
			bublesortInt(num);
			
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("Time Taken"+ totalTime);
		}
		
		
		public static void bublesortInt(int numbers [])
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
                                      flag = true;
                           } 
                   } 
            } 
            System.out.println("After Sorting");
            for (int k=0;k<numbers.length;k++)
            {
            	System.out.println(k);
            }
            
      } 

}

