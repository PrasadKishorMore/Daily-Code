

class Prog3{


    public static void main(String[] args){


        int arr1 = {1,2,1};
        int arr2[] = new int[arr1.length];
        int j=0;

        for(int i=arr1.length-1; i >=0; i--){

            arr2[j] = arr1[i];
            j++;
        }

        System.out.println(arr1.equals(arr2));
    }
}