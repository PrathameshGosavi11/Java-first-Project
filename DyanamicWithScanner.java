public class DyanamicWithScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		 int size=scanner.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the value");
		for (int i = 0; i < size; i++) {
			int arrayValues = scanner.nextInt();
			arr[i] = arrayValues;
		}

		System.out.println("Print the array");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		scanner.close();
	}

}
