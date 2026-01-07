
public class Reverse{


    public static void main(String[] args){

        String str ="prasad";

     //step 1:
        for(int i = str.length()-1; i>=0; i--){

            System.out.print(str.charAt(i));
        }

       // step 2:
       
       String str2 = "";

       for(int j=0; j<str.length(); j++){

        str2 = str.charAt(j) + str2;
       }

       System.out.println(str2);

       //step 3

       StringBuffer sb = new StringBuffer(str);

       System.out.println(sb.reverse());



    }
}