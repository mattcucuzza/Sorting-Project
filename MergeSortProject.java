// Merge Sort Class
// Matthew Cucuzza
// 5/03/14
//
// Creates an array of random integers and sorts
// the numbers in the array by way of a "Merge" sort method

public class MergeSortProject {
	
	//Variables
    private int[] numbers;
    private int[] helper;
    private int number;
    private int comparisons;
    
    
	//Methods
    //Make an array of size n of random integers
    public int[] randomMethodArray(int n, double range){
        int[] methodArray = new int[n];
        for(int i = 0; i < n; i++){
            methodArray[i] = (int)(Math.random() * range);
        }
        return methodArray;
    } 

    //This is the master method that fully sorts the array using a splitting array method
    //This returns an array value that is fully sorted
    public int[] sort(int[] values) {
	    this.numbers = values;
	    number = values.length;
	    this.helper = new int[number];
	    mergesort(0, number - 1);
	    return values;
    }
    
    //This method sorts parts of the array
    private void mergesort(int low, int high) {
	    // check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
	    }
    }
    
    //This method combines the pieces of the array after they are sorted
    private void merge(int low, int middle, int high) {
        
	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
	    }
        
	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                comparisons++;
                i++;
            } else {
                numbers[k] = helper[j];
                comparisons++;
                j++;
            } 
            k++;
	    } 
	    
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
            numbers[k] = helper[i];
            comparisons++;
            k++;
            i++;
        }
    }
    
    
    //Print the array at the end, this is most used for testing and proving
    // purposes
    public void printArray(int[] intArray){
        System.out.print("Array==> ");
        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        } // end for
        System.out.println(" "); 
    }

    //Obtain the value of comparisons for the sorted array
    public int getComparisons() {
    	int prevComparisons = comparisons;
    	comparisons = 0;
        return prevComparisons;
    }
}