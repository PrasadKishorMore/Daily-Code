public class Prog9 {
    

    public static void main(String[] args) {
        
        int arr[] = {12,-45,3,-2,-1};

        for(int i=0; i<arr.length; i++){

            if(arr[i]< 0){
                arr[i] = 0;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
