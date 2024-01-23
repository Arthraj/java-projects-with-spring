package que2;

import java.io.*;

public class arraySort{
	void customSort(int arr[], int size)
	{
		int left = 0, right = size - 1;

		while (left < right)
		{
			while (arr[left] == 0 && left < right)
				left++;

			while (arr[right] == 1 && left < right)
				right--;

			if (left < right)
			{
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}
	
	public static void main(String[] args)
	{
		arraySort x = new arraySort();
		int arr[] = new int[]{1,0,1,0,0,0,1,1};
		int i=arr.length;
		int n = arr.length;

		x.customSort(arr, n);

		System.out.print("Sorted Array: ");
		
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}

