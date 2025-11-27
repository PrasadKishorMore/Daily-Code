package Day2;

public class P6 {
   
    public static void main(String[] args) {
        
         

    String str = "PrasadMore";

    for(int i=0; i<str.length(); i++){

        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
            System.out.println( "Capital letter = " + str.charAt(i));
        }else{
            System.out.println("small letter =" + str.charAt(i));
        }
    }
    }
}
