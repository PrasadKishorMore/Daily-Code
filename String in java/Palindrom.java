public class Palindrom {
    
    public static void main(String[] args){

        String str1 ="level";
       

        String str2 = "";

        for(int i=0; i<str1.length(); i++){

            str2 = str1.charAt(i) + str2;
        }

        if(str1.equals(str2)){

            System.out.println("It is palindrom !");
        }else{

            System.out.println("it is not palindrom !");
        }
    }
}
