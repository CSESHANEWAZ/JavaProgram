
package array;

import java.util.Scanner;


public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter any integer number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("largest Element is: "+max );
    }
}
