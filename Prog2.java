
class Prog2{


    public static void main(String[] args){

        int arr = {23,0,4,6,44,88,22};

        int max = arr[0];
        int min = arr[0];


        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(max +"+ "+ min);
    }
}