/* Java program to get array size and array elements form user and display the normal array and reversed array  */

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        /* Basic way to define an array size and its element.

        int[][] arr ={{1,2,3,4},{5,6,7},{8,9,0}}; 
        int arr[] = new int[5];
        arr[0]=1;
        arr[2]=4;
        arr[1]=5;
        arr[3]=9;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
            System.out.print(arr[i][j]+ " ");
            
            
            System.out.println();
        }*/
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array  Size ");
        int size= sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements");

        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        System.out.print("Array is - ");
        for(int i=0;i<size;i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\nReverse is - ");
        for( int i=size-1;i>=0 ; i--)
        {
            System.out.print(array[i]+" ");
        }
    

    }
    
}
