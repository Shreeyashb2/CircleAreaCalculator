
public class FunctionTypeTest {

	public static void main(String[] args) {
		Calculator myCalci;
		myCalci = new Calculator();
		myCalci.welcome();
		myCalci.definedValues(15);
		float area = myCalci.area(15);
		System.out.println("Area of Circle is "+area);
		double pi = myCalci.constants();
		System.out.println("Constant value of PI is "+pi);
	}
}
class Calculator
{
	void welcome()
	{
		System.out.println("Welcome to Area Calculator");
		System.out.println("------------------------------------------");
	}
	float area(float x)
	{
		
		System.out.println("So, the Area of Circle is ");
		return 3.1415926535898f *(x*x);
	}
	void definedValues(float y)
	{
		System.out.println("Defined Values for the Circle are given ");
		System.out.println("Radius is "+y);
		System.out.println("------------------------------------------");
	}
	double constants()
	{
		return 3.1415926535898;
	}
}
/*
Functions are of 4 types:
1. Func without taking arguments
			without returning values
2. Func with taking arguments
			with returning values
3. Func without taking arguments
			with returning values
4. Func without taking arguments
			with returning values			
*/
