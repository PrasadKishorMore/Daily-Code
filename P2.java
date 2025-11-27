package Day2;

public class P2 {
    

   public static void main(String[] args) {
    
        String str = "prasad";
        int vowels = 0;

    for(int i=0; i<str.length(); i++){
      
         if(str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                
            vowels++;

            System.out.println(str.charAt(i));

         }
        }     
    }
}
