class Calci
{
		
	public void substract(int a,int b)
	{
		int sub=a-b;
		System.out.println("Sustraction is:"+sub);
	}
}
public class Calculator {
	
public static void main(String[] args) {
		
		Calci calci=new Calci();
		calci.substract(3,1);
	}
}