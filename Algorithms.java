import java.util.*;
public class Algorithms{

    /* Bubble Sort Algorithm
    public static void BubbleSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    */

    /* Selection Sort Algorithm
     public static void SelectionSort(int array[]){
        for(int i=0; i<array.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j] < array[minIndex]){  // use '>' for Descending order
                    minIndex = j;
                }
            }
            // Swap
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
     }
    */

    /* Insertion Sort Algorithm
    public static void InsertionSort(int array[]){
        for(int i=1; i<array.length; i++){
            int curr = array[i];
            int prev = i-1;
            // Find Currect position to insert
            while(prev>=0 && array[prev] > curr){
                array[prev+1] = array[prev];
                prev--;
            }
            // Insertion
            array[prev+1] = curr;
        }
    }
    */

    /* Couting Sort Algorithm
    public static void CountingSort(int array[]){
        int largest = Integer.MIN_VALUE;    
        for(int i=0; i<array.length; i++){
            largest = Math.max(largest, array[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }

        // Sorting
        int j=0;
        for(int i=0; i<array.length; i++){
            while(count[i] > 0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    */

    public static void PrintArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }



    public static void main(String agrs[]){
        // int array[] = {5,4,1,3,2};
        // BubbleSort(array);
        // SelectionSort(array);
        // InsertionSort(array);
        int array[] = {1,4,1,3,5,7,6};
        CountingSort(array);
        PrintArray(array);

    }
}