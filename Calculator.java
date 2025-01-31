class Calci
{
	public void  add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is:"+sum);
	}
}
public class Calculator {
	
public static void main(String[] args) {
		
		Calci calci=new Calci();
		calci.add(2, 2);
	}
}