class Calci
{
		
	public void substract(int a,int b)
	{
		int sub=a-b;
		System.out.println("Sustraction is:"+sub);
	}

	public void mul(int a,int b)
	{
		return mult=a*b;
		System.out.println("multiplication is :"+mult);
	}
}
public class Calculator {
	
public static void main(String[] args) {
		
		Calci calci=new Calci();
		calci.substract(3,1);
		calci.mul(2,2);
	}
}