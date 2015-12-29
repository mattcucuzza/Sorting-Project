// Selection Sort Class
// Matthew Cucuzza
// 5/02/14
//
// Creates an array of random integers and sorts
// the numbers in the array by "Selection sorting"

public class SelectionSortProject{
    
    // Performs Selection Sort & counts the comparisons of each element
	public static int selectionSortComparisons (int[] intArray){
        // Tracks comparisons after each pass
		int comparisons = 0;
		for(int last = intArray.length - 1; last > 0; last--){
			int indexOfLargest = last;
			
			// Find largest element in unsorted array
			for(int i = 0; i < last; i++){
				comparisons++;
				if (intArray[i] > intArray[indexOfLargest]){
					indexOfLargest = i;
				} // end if statement
			} // end second for loop
			
			// Swap last element with largest element
			int temp = intArray[last];
			intArray[last] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
		} // end first for loop
		return comparisons;
	} 
	
    // Prints the array
	public static void printArray(int[] intArray){
		System.out.print("Array==> ");
		for(int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		} 
		System.out.println(" ");
	}
	
    // Creates an array of random integers
	public static int[] randomIntArray(int n, double range){
		int[] intArray = new int[n];
		for(int i = 0; i < n; i++){
			intArray[i] = (int)(Math.random() * range);
		} // end for loop
		return intArray;	
	} 
} // end SortMethods