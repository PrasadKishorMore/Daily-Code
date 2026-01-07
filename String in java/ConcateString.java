public class ConcateString {
    

    public static void main(String[] args){

        String str1 = "prasad";

        String str2 = "More";

        //step 1;
        System.out.println(str1.concat(str2));

        
        //step2;

        String str3 ="";

        for(int i=0; i<str1.length(); i++){

            str3 += str1.charAt(i);
        }

        for(int j=0; j<str2.length(); j++){
            str3 += str2.charAt(j);
        }

        System.out.println(str3);

    }
}
