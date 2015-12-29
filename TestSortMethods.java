// Test Sort Methods
// Matthew Cucuzza
// 5/02/14
//
// Test class for random integers being placed
// into an array and being sorted using
// selection sort, bubble sort, and
// merge sort

public class TestSortMethods{
	public static void main(String[] args){
        
        /****************************************
         **************  Selection ***************
         **************  Sorts     ***************
         **************  Located   ***************
         **************  Below     ***************
         *****************************************
         ****************************************/
        
        System.out.println("SELECTION SORT METHOD: ");
        System.out.println (" ");
        
        // Array Size 2,000
        System.out.println("Array Size: 2000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 2,000
		int[] firstSelecArray2000 = SelectionSortProject.randomIntArray(2000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           SelectionSortProject.selectionSortComparisons(firstSelecArray2000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        
        
        // Array Size 4,000
        System.out.println("Array Size: 4000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 4,000
		int[] firstSelecArray4000 = SelectionSortProject.randomIntArray(4000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           SelectionSortProject.selectionSortComparisons(firstSelecArray4000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        
        
        // Array Size 6,000
        System.out.println("Array Size: 6000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 6,000
		int[] firstSelecArray6000 = SelectionSortProject.randomIntArray(6000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           SelectionSortProject.selectionSortComparisons(firstSelecArray6000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        

        // Array Size 8,000
        System.out.println("Array Size: 8000");
        System.out.println("-------------------------------------");
        
        // First test for array size 8,000
		int[] firstSelecArray8000 = SelectionSortProject.randomIntArray(8000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           SelectionSortProject.selectionSortComparisons(firstSelecArray8000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");

        // Array Size 10,000
        System.out.println("Array Size: 10000");
        System.out.println("-------------------------------------");
        
        // First test for array size 10,000
		int[] firstSelecArray10000 = SelectionSortProject.randomIntArray(10000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           SelectionSortProject.selectionSortComparisons(firstSelecArray10000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--End Selection Sort Tests--");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" "); // end of Selection Sorting
        
        
       
        /***************************************
         ************** Bubble  *****************
         ************** Sorts   *****************
         ************** Located *****************
         ************** Below   *****************
         ****************************************
         ****************************************/
        
        System.out.println("BUBBLE SORT METHOD: ");
        System.out.println (" ");
        
        // Array Size 2,000
        System.out.println("Array Size: 2000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 2,000
		int[] firstBubArray2000 = BubbleSortProject.randomBubbleArray(2000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           BubbleSortProject.bubbleSortComparisons(firstBubArray2000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        
        // Array Size 4,000
        System.out.println("Array Size: 4000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 4,000
		int[] firstBubArray4000 = BubbleSortProject.randomBubbleArray(4000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           BubbleSortProject.bubbleSortComparisons(firstBubArray4000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        
        // Array Size 6,000
        System.out.println("Array Size: 6000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 6,000
		int[] firstBubArray6000 = BubbleSortProject.randomBubbleArray(6000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           BubbleSortProject.bubbleSortComparisons(firstBubArray6000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        
        // Array Size 8,000
        System.out.println("Array Size: 8000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 8,000
		int[] firstBubArray8000 = BubbleSortProject.randomBubbleArray(8000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           BubbleSortProject.bubbleSortComparisons(firstBubArray8000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");

        // Array Size 10,000
        System.out.println("Array Size: 10000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 10,000
		int[] firstBubArray10000 = BubbleSortProject.randomBubbleArray(10000, 10000.00);
		System.out.println("First test...  Number of comparisons: " +
                           BubbleSortProject.bubbleSortComparisons(firstBubArray10000));
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--End Bubble Sort Tests--");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        

        /***************************************
         ************** Merge   *****************
         ************** Sorts   *****************
         ************** Located *****************
         ************** Below   *****************
         ****************************************
         ****************************************/

        System.out.println("MERGE SORT METHOD: ");
        System.out.println (" ");
        MergeSortProject mergeArray = new MergeSortProject();

        // Array 2,000
        System.out.println("Array Size: 2000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 2,000
        mergeArray.sort(mergeArray.randomMethodArray(2000, 10000.00));
        System.out.println("First test...  Number of comparisons: " + mergeArray.getComparisons());
        System.out.println ("-------------------------------------");
        System.out.println(" ");

        // Array 4,000
        System.out.println("Array Size: 4000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 4,000
        mergeArray.sort(mergeArray.randomMethodArray(4000, 10000.00));
        System.out.println("First test...  Number of comparisons: " + mergeArray.getComparisons());
        System.out.println ("-------------------------------------");
        System.out.println(" ");

        // Array 6,000
        System.out.println("Array Size: 6000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 6,000
        mergeArray.sort(mergeArray.randomMethodArray(6000, 10000.00));
        System.out.println("First test...  Number of comparisons: " + mergeArray.getComparisons());
        System.out.println ("-------------------------------------");
        System.out.println(" ");

        // Array 8,000
        System.out.println("Array Size: 8000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 8,000
        mergeArray.sort(mergeArray.randomMethodArray(8000, 10000.00));
        System.out.println("First test...  Number of comparisons: " + mergeArray.getComparisons());
        System.out.println ("-------------------------------------");
        System.out.println(" ");

        // Array 10,000
        System.out.println("Array Size: 10000");
        System.out.println ("-------------------------------------");
        
        // First test for array size 10,000
        mergeArray.sort(mergeArray.randomMethodArray(10000, 10000.00));
        System.out.println("First test...  Number of comparisons: " + mergeArray.getComparisons());
        System.out.println ("-------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--End Merge Sort Tests--");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--End Of Testing--");
        System.out.println(" "); 
    } // end of main 
} // end of TestSortMethods class