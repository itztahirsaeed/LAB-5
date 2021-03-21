package Lab5TAHIR_SAEED;

public class Fraction_Runner {

	public static void main(String[] args) {
		Fraction f=new Fraction();
		Fraction f1=new Fraction(4,5);
		f1.get();
		if(f1.equals(4, 3))
		{
		System.out.println("FRACTION IS SAME");	
		}
		else
		{
			System.out.println("FRACTION IS NOT SAME");
		}
		// using setter
		f1.set(4, 3);
		if(f1.equals(4, 3))
		{
		System.out.println("FRACTION USING SETTER IS SAME");	
		}
		else
		{
			System.out.println("FRACTION USING SETTER IS NOT SAME");
		}
		

	}

}
