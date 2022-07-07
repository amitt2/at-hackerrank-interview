package at.hackerrank.interview.sort;

public class SelectionSort {

    public static void selectionSort(int[] elements, int size){
        for(int i=0; i<size-1; i++){
            int iMin = i;
            for (int j=i+1; j<size; j++){
                if(elements[j] < elements[iMin]){
                    iMin = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[iMin];
            elements[iMin] = temp;
        }
    }
    public static void printElements(int[] elements){
        for (int element : elements) {
            System.out.print(element + " ");
        }
    }
}
