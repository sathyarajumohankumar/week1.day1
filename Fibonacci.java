package week1.day1;

public class Fibonacci {


	// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a=0,b=1,i,c;
System.out.print(a+ " " +b);
for(i=2;i<10;i++)
{
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
	
	
}

	}

}
