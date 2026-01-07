public class RemoveWhiteSpace {
    
    public static void main(String[] args) {
        
        String str ="prasad more";

        String str1 ="";


        for(int i=0; i<str.length();i++){

            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                str1 += str.charAt(i);
            }
        }

        System.out.println(str1);
    }
}
