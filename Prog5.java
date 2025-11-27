import java.util.Arrays;

import java.util.HashSet;

public class Prog5 {
    

    public static void main(String[] args) {
        
        Integer arr[] ={12,43,54,66,12};


        HashSet<Integer> hs= new HashSet<>(Arrays.asList(arr)); //use for remove dublicate
        System.err.println(hs);
        
       
        for (Integer num : hs) {
            

            int count = 0;

            for(int i=0; i<arr.length; i++){

                if(arr[i] == num){
                    count++;
                }
            }

            System.err.println(num +"="+ count);   // count each element print
        }
        


    }

}
