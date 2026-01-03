
package Java;

import java.util.Arrays;

public class J5 {

    public static void main(String[] args) {
        
        int arr[]={12,43,11,55};

        int num = arr[0];

        for(int i=1; i<arr.length; i++){

            arr[i-1] = arr[i];

        }

        arr[arr.length-1] = num;

       

        System.out.println( Arrays.toString(arr));


    }

    
    
}