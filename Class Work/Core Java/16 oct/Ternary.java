class Ternary
{
	public static void main(String ar[])
	{
		int a=10;
		int b=20;
		int c=3;
		int y=a>b?(a>c?a:(b>c?b:c));
		System.out.println("largest is: "+y);
	}
}