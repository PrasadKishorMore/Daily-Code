package Day2;

public class P4 {
    
    public static void main(String[] args) {
        
        String str ="prasad more";

       String newstr = "";
        for(int i=0; i<str.length(); i++){

            if( ! (str.charAt(i)== ' ')){

                  newstr += str.charAt(i);
            }             
        
        }


        System.out.println(newstr);
        
        
    }
}
