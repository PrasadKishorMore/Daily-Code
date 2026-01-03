

public class Pro2 {
    


    public static void main(String[] args) {
        
        int arr[] = {78,44,53,22,4,2,8};

        int target = 53;

        int left = 0;
        int right = arr.length-1;

        while(left <= right){


             int mid = (left +right)/2;

             if(arr[mid] == target){

                System.out.println(mid);
                break;
             }
             else if(arr[mid] < target){
                left ++;
             }else{
                right--;
             }
        }
    }

}
