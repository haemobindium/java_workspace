import java.util.ArrayList;
import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
    	
    	//ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	Scanner sc = new Scanner(System.in);

		// Initialize sum and count of input elements
		int sum = 0,count = 0;

		// Check if an int value is available
		while (sc.hasNextInt())
		{
			// Read an int value
			int num = sc.nextInt();
			sum += num;
			count++;
	//		if(sc.equals("\0"))
		//		break;
		}
		int mean = sum/count;
		System.out.println("Mean: " + mean);
		
    	
    	//standard deviation
    	
    //(x-total/n)2/n-1
    	

    }
}
