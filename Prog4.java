
class Prog4{


    public static void main(String[] args){


        int arr[]={11,12,14,0,13};

        int max = arr[0];
        int secmax=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]>max){
                secmax = max;
                max = arr[i];
            }else if(arr[i] != max && arr[i] > secmax){
                secmax = arr[i];
            }
        }

        System.out.println(max +"+"+ secmax);
    }
}