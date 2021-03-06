/*
Remove Duplicate Element in Unsorted Array
 */
package array;

import java.util.Arrays;
import java.util.Scanner;


public class Remove_Duplicate_Elements {
    public static int RemoveDuplicateElement(int[] arr,int total){
       
       int j =0;
        for (int i = 0; i < total -1 ; i++) {
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[total - 1];
        
        return j;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    int[] arr = new int[8];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }*/
        int length = arr.length;
        length = RemoveDuplicateElement(arr,arr.length);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        }
    }
    
    

