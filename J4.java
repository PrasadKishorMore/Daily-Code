package Java;

public class J4 {
    

    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,2,0};

        int c1  = 0;
        int num  = 0;


        for(int i=0; i<arr.length; i++){

            int c2 = 1;

            int j=0;

            while (j >= 0) {
                
                if(arr[j] == arr[j+1]){
                    c2++;
                    j++;
                }else{
                    j = 0;
                }
            }

            if(c2 > c1){
                c1 = c2;
                num = arr[i];
            }
        }

        System.out.println(num);

    }
}
