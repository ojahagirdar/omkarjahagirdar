package com.neosoft.basic;

public class program4 {

	
	
	
	
	
	
	
    static void replace(int[] arr)
    {
        // Stores length of array
        int n = arr.length;
 
        // Traverse array
        for (int i = 0; i < n; i++) {
 
            for (int j = i + 1; j < n; j++) {
 
                // If current element is even
                // then swap it with odd
                if (arr[i] >= 0
                    && arr[j] >= 0
                    && arr[i] % 2 == 0
                    && arr[j] % 2 != 0) {
 
                    // Perform Swap
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
 
                    // Change the sign
                    arr[j] = -arr[j];
 
                    break;
                }
 
                // If current element is odd
                // then swap it with even
                else if (arr[i] >= 0
                         && arr[j] >= 0
                         && arr[i] % 2 != 0
                         && arr[j] % 2 == 0) {
 
                    // Perform Swap
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
 
                    // Change the sign
                    arr[j] = -arr[j];
 
                    break;
                }
            }
        }
 
        // Marked element positive
        for (int i = 0; i < n; i++)
            arr[i] = Math.abs(arr[i]);
 
        // Print final array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Given array arr[]
        int[] arr = { 1, 3, 2, 4 };
 
        // Function Call
        replace(arr);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
