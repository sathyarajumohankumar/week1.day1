package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=23;
int flag=0;
if(input==0||input==1)
	{
	System.out.println("prime number");
	}
	else
	{
		for(int i=2;i<=input/2;i++)
		{
			if(input%2==0)
			{
				
				System.out.println("not a prime");
				flag=1;
			}
		break;
		}
		
			if(flag==0)
			{
				System.out.println("prime number");
			}
		}
	}
}


