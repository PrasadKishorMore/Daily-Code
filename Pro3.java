
import java.util.*;
public class Pro3 {

    

    public static void main(String[] args){


        Scanner s = new Scanner(System.in);

        String arr[] = new String[5];

        for(int i=0; i<arr.length; i++){

            System.out.println("Enter name " + i + "\n");
            arr[i] = s.next();
        }

      
        for (String str : arr) {
            

            System.out.println(str);
        }
    
    }


}
