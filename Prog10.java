public class Prog10 {
    
    public static void main(String[] args) {
        
        int arr[] = {12,44,32,11};

        for (int i=0; i<arr.length;i++) {
            
            if(arr[i] % 2 != 0){

                arr[i] = -1;
            }
        }

        for (int i : arr) {
            
            System.out.println(i);
        }
    }
}
