
package bubblesort;

import java.util.Scanner;

public class Bubblesort {
static void bubbleSort(int[] array) {  
     
    int value = 0;  
         for(int i=0; i < 10; i++){  
            for(int j=1; j < (10-i); j++){  
                if(array[j-1] > array[j]){  
                          
     value = array[j-1];  
     array[j-1] = array[j];  
    array[j] = value;  
          }  
      }
   }
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 Numbers:");

    int numbers[]=new int[10];

        for (int i=0;i<10;i++) {
                numbers[i]=input.nextInt();
        }
        
        bubbleSort(numbers);
                 
         System.out.print("Sorted numbers from low to high: ");  
         for(int i=0; i < numbers.length; i++){  
         System.out.print(numbers[i] + " ");  
                }
    }
}
