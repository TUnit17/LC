package houseRobber;


public class theRobber
{
	public static void main(String[] args)
	{
		//int[] arr = {1,2,3,1}; //4
		//int[] arr = {1,2,3,4}; // 6
		int[] arr = {2,7,9,3,1}; //12
		
		
		
		int result = houseRobberr(arr);
		System.out.println(result);
	}

	private static int houseRobberr(int[] arr)
	{
		return helper(arr, 0, arr[0], arr[0]);
	}

	private static int helper(int[] arr, int index, int sum, int max)
	{
		print("helper(arr," + index +","+max+","+sum+") **** ");
		
		if(index > arr.length) {
			print("return 0 *****");
			return 0;
		}
		System.out.print("all possible values of i: ");
		for(int i = index; i < arr.length-2; i++) {
			System.out.print(i+", ");
		}
		print("");
		
		
		for(int i = index; i < arr.length-2; i++) {
			// reset the sum on the odd
			if(i == 1) {
				print("reset sum");
				sum = arr[1];
			}
			print("i:" + i);
			sum = sum+ arr[i+2];
			print("new sum:" + sum);
			if(sum > max) max = sum;
			print("new max:" + max);
			helper(arr, i+2, sum, max);
		}
		print("return max");
		return max;
	}
	
	private static void print(Object s) {
		System.out.println(s);
	}
}
