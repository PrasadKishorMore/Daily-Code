import java.util.Arrays;

public class Prog11 {
    
    public static void main(String[] args) {
        
        int arr[] ={12,4,3,7};

        for(int j=0; j<arr.length; j++){

            arr[j] = arr[j]+5;
        }

        System.out.println(Arrays.toString(arr));
    }
}
