package Day2;

public class P3 {
    

    public static void main(String[] args) {
        
        String s = "12Prasad134";

        String str = s.toLowerCase();

        int digit = 0;

        for(int i=0; i<str.length(); i++){

            if( ! (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ){

                digit++;
            }
        }

        System.out.println(digit);
    }
}
