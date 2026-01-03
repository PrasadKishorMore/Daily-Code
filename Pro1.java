public class Pro1 {
    

    public static void main(String[] args){

        System.out.println("Hello, World!");

        // lenth of number 


        int num = 123;

        int length = String.valueOf(num).length();

        System.out.println("Length of number: " + length);


       
        int arr[] = {1,4,3,5,7};

        int len = arr.length;

        int arr2[] = new int[len];

        int sum = 0;

        int max  = arr[0];
        int min = arr[0];

        int j = len;

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);

            if(arr[i] % 2 == 0){
                System.out.println("even number =" + arr[i]);
            }

            if(arr[i] > max){
                max = arr[i];

            }

            if(arr[i] < min){
                min = arr[i];
            }

            sum += arr[i];

            arr2[j-1] = arr[i];
            j--;
        }

        System.out.println(sum);
        System.out.println(min + "and "+ max );

        for(int val : arr2){
            System.out.println(val);
        }
    }
}
