package Java;

public class J3 {
    
    public static void main(String[] args) {
        

        int arr[] = {1,5,40,20};

        int  count =0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] % 5 == 0){
                  count++;
            }
        }

         System.out.println(count);
    }
}
