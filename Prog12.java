import java.util.Arrays;

public class Prog12 {
    

    public static void main(String[] args) {
        
        int arr[] ={12,4,3,6,8};

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
