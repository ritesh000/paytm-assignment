
public class PrimeNumber {

	public static void main(String[] args) {

		int i, j, num, count,p=1;
		for (i = 1; i <=1000; i++) 
		{
			count = 0;
			for (j = 2; j < i / 2; j++) 
			{
				if (i % j == 0) 
				{
					count++;
					break;
				}
			}
			if (count == 0 && i != 1 && p<=100) 
			{
				System.out.println(i);
				p++;
			}
		}
	}
}


/*
 * prime number
 * 
 * 1.loop satrt 1 beacuser this loop count number and rang upto 1000. 2.count=0
 * becauser 2nd for loop inside change count value only count i%j==0 and print
 * number . 3.prime number complete divide like i/j==0 and count value 0;
 */
