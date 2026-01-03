package Java;

import java.util.Arrays;

class J1{

    public static void main(String[] args) {
        
        int arr1[] = {2,3,4,5,6};

        int arr2[] = {3,5,4,7};

         int t = arr1.length + arr2.length;
        int arr3[] = new int[t];

        int k=0;

        for (int i : arr1) {
            
            arr3[k] = i;
            k++;
        }

        for(int j : arr2){

            arr3[k] = j;
            k++;
        }

        Arrays.sort(arr3);

        System.out.print("[");
        for (int i : arr3) {
            System.out.print(i +",");
        }
        System.out.println("]");

    }
}