public class Prog8 {
    
    public static void main(String[] args) {
        
        int arr[] = {22,444,55,22};

        int pro = 1;

        for (int i : arr) {
            
               pro *= i;
        }

        System.out.println(pro);
    }
}
