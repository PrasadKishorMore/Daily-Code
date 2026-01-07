public class AnagramString {
 
    public static void main(String[] args){


        String str1 = "prasad";
        String str2 = "prasad";

        Boolean flag = true;

        if(str1.length() != str2.length()){
            flag = false;
        }

     
        for(int i=0;i<str1.length(); i++){

            int count = 0;
           for(int j=0; j<str2.length();j++){

            if(str1.charAt(i) == str2.charAt(j)){
                count++;
            }

          
           }

             if(count == 0){
                flag = false;
                break;
            }
        }

        System.out.println(flag);

    }
}
