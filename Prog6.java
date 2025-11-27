import java.util.Scanner;

public class Prog6 {
    
    public static void main(String[] args) {
        System.out.println("enter value ! \n ");
        Scanner s = new Scanner(System.in);
        
    
        int num = s.nextInt();

        int arr[] = {12,43,55,66};

        for(int j=0; j<arr.length; j++){

            if(arr[j] == num){
                System.out.println("value present");
                break;
            }
        }

        System.out.println("provide valide number !");

    }
}
