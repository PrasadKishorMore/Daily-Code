public class AccessCharacter {
    
    public static void main(String[] args) {
        
        String str ="pra457ou";

        String str2 ="";

        // step 1

        for(int i=0; i<str.length();i++){

            if(str.charAt(i) >='a' && str.charAt(i) <='z'){
                str2 += str.charAt(i);
            }
        }

        System.out.println(str2);

        //step 2

        String str3 ="";

        for(int j=0; j<str.length();j++){

            if(str.charAt(j) >='0' && str.charAt(j) <='9'){

                str3 += str.charAt(j);
            }
        }

        System.out.println(str3);


        //step 3

        System.out.println(str2.concat(str3));
    
    }
}
