class BMI
{
	public static void main(String ar[])
	{
		double height=1.75;
		double weight=85.4;
		double bmi=w/(h*h);

		System.out.println("BMI is: "+b);

		if(bmi>30)
		{
			System.out.println("obese");	
		}
		else if(bmi>25)
		{
			System.out.println("overweight");	
		}
		else if(bmi>=18.5)
		{
			System.out.println("normal");	
		}
		else
		{
			System.out.println("underweight");
		}
		
		
	}
}