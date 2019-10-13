// demonstrating the Java for loop
import java.util.Scanner; // import a scanner c
import java.security.SecureRandom; 	// imports a secure random class


public class ForExample1
{
	public static void main(String[] args)
	{
    	//Code of Java for loop


		int endCash = 10;
		int startCash = 2;
		int current = startCash;
    	for(int i = 1; i <= 5; i++)
    	{
			if(startCash <= 0);
			{
				System.out.println("it was lower");




				//int trials = 1;

				int counter =1;
				do
				{
					SecureRandom randomNumber = new SecureRandom();
					int number = randomNumber.nextInt(101);
					//System.out.println("startCash " + startCash );
					System.out.println("start amount of " + startCash + " end amount of " + endCash);
					System.out.println(number);

					if( number <= 50)
					{
						System.out.println(" I lost ");
						startCash--;
						System.out.println("start amount of " + startCash + " end amount of " + endCash);
					}
					else
					{
						System.out.println( " I won ");
						startCash++;
						System.out.println("start amount of " + startCash + " end amount of " + endCash);
					}



					//System.out.println("current counter total" + counter);
					//System.out.println("startCash " + startCash );
					//counter++;
				}
				while((startCash < endCash) && (startCash > 0));
				counter++;
				System.out.println("outerLoop" + i);
				System.out.println("wins" + i);
			}
        	//System.out.println("outerLoop" + i);
    	} // end of for loop
	}  // end of main method
}  // end of class ForExample