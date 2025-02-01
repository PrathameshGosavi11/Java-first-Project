class Array
{
	public static void main(String[] args)
	 {
		
		float[] b= {12.0f,30.0f,90.4f}; //declare array
		int[] a= {10,20,50};
		char[] carr= {'c','f'};
		String[] name= {"Pratham","Janhavi","roshani","prasad"};
		
		System.out.println("Display are using this technique");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("Display array using for loop");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//*********************************************//
		System.out.println("access float array without using looep");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		System.out.println("using the for loop");
		for(int i=1;i<3;i++)
		{
			System.out.println("access float array using for loop:"+b[i]);
		}
		System.out.println("without loop acces character ");
		System.out.println(carr[0]);
		System.out.println(carr[1]);
		
		System.out.println("using the for loop");
		for(int i=0;i<carr.length;i++)
		{
			System.out.println(carr[i]);
		}
		
		System.out.println("String array access without using the  any loop");
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		System.out.println("Using the  while loop");
		int i=0;
		while (i<name.length)
		{
			System.out.println(name[i]);
			i++;
			
		}
		
		System.out.println("element access using the for loop");
		for(int i1=0;i1<name.length;i1++)
		{
			System.out.println(name[i1]);
		}
	}

}
