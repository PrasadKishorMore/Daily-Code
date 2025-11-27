import java.util.Arrays;

public class Prog13 {
    
    public static void main(String[] args) {
        
        int arr[] ={12,5,7,2};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    
        }

        System.out.println(Arrays.toString(arr));

        for(int i=arr.length-1; i>=0; i--){
            int count = 0;
            System.out.println(arr[i]);

            if(count == 2) break;

            count++;

        }

        int mid =(0 + arr.length)/2;

        System.out.println("mid value into array =" + arr[mid]);
    }

}
