package week1.day1;

public class IsPrime {
	
	public static void main(String[] args) {
		
		int n = 11;
		boolean flag = true;
		
		for(int i =2; i< n; i++)
		{
			if  (n%i==0)
			{
				System.out.println("This is not a prime number");
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("This is a Prime Number");
		}
		
	}

}
