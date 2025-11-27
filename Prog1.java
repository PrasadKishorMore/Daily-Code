

class Prog1{


    public static void main(String[] args){

        System.out.println("welcome to my world");

        int arr[] = {12,45,67,33,22};

        for(int i=0; i<arr.length-1; i++){

            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        

        //System.out.println(Arrays.toString(arr));
        for(int a: arr){
            System.out.println(a);
        }

        int target = 45;

        int st = 0;
        int en = arr.length-1;

        while(st <= en){

            int mid = (st+en)/2;

            if(arr[mid] == target){
                System.out.println("yes value is present !");
                break;
            }else if(arr[mid] < target){
                st = mid;
            }else{
                en = mid;
            }
        }
    }
}