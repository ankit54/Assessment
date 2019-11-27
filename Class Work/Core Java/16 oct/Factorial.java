class Factorial
{
	static int fact(int n){
		if(n==0)
			return 1;
	
		return n*fact(n-1);
	}
	public static void main(String ar[])
	{
		int i=fact(10);
		System.out.println("factorial is "+i);
		
	}
}