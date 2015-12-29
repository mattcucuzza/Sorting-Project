// Bubble Sort Class
// Matthew Cucuzza
// 5/02/14
//
// Creates a class that creates a random array
// of integers and sorts them using
// bubble sort

public class BubbleSortProject {

    // Creates an array of random integers
    public static int[] randomBubbleArray(int n, double range) {
		int[] bubbleArray = new int[n];
		for(int i = 0; i < n; i++){
			bubbleArray[i] = (int)(Math.random() * range);
		} 
		return bubbleArray;
	} 
    
    // Prints the array of random integers
    public static void printArray(int[] bubbleArray){
		System.out.print("Array==> ");
		for(int i = 0; i < bubbleArray.length; i++){
			System.out.print(bubbleArray[i] + " ");
		}
		System.out.println(" ");
	} 
    
    // Sorts the array of integers by Bubble sorting and counts
    public static int bubbleSortComparisons (int[] bubbleArray){
        // Tracks the number of comparisons per pass
        int comparisons = 0;
        
        //Creates a temporary variable that constantly changes
        int tempVar;
        
        // Tracks the numbers in array
        for (int i = 0; i < bubbleArray.length-1; i++) {
            
            // Second for loop tracks in order to set up comparison
            // for adjacent integers
            for(int j = 1; j < bubbleArray.length-1; j++) {
                
                // If the current integer is greater than its next one run statement
                if(bubbleArray[j] > bubbleArray[j+1]) {
                    
                    // Stores current location in variable tempVar
                    tempVar = bubbleArray [j];
                    
                    // Updates the current location to the next integer
                    bubbleArray [j]= bubbleArray [j+1];
                    
                    // Stores the now updated location in the variable tempVar
                    bubbleArray [j+1] = tempVar;
                    
                    // Updates comparisons
                    comparisons++;   
                }     
            }   
        } 
        return comparisons;
    }
} 