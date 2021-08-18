package array_assignments;

public class ConsecutiveArray { 
	static void  sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	public static int consecutiveNo(int[] arr) {
		int length=0;
		//int currLength=0;
		for(int i=0;i<arr.length;i++) {
			int currLength=1;
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[j]+1==arr[j+1]) {
					currLength++;
				}else {
					break;
				}
			}
			if(currLength>length)
				length=currLength;
		}




		return length;

	}
	public static void main(String[] args) {
		int arr[]= {45,45,23,48,53,47,46,49};
			//{49, 1, 3, 200, 2, 4, 70, 5};
     sort(arr);
    System.out.println("current length :"+consecutiveNo(arr));
	}

}
