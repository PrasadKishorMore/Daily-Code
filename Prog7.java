public class Prog7 {
    

    public static void main(String[] args){

        int arr[] = {12,43,55,66};

        int sum = 0;
        int total = arr.length;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];
        }

        int avg = (sum/total);

        System.out.println(avg);
    }
}
