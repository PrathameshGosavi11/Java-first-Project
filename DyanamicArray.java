public class DyanamicArray 
{
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] arr=new int[5]; 
		
		arr[0]=21;
		arr[1]=22;
		arr[2]=24;
		arr[3]=25;
		arr[4]=26;
	
		for(int i=0;i<arr.length;i++)// 0-> 12 1->13 2->14 3->
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		scanner.close();
	}

}