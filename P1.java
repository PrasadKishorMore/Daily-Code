package Day2;

public class P1 {
    
    public static void main(String[] args) {
        
        String st="Prasad";

        StringBuffer sb =  new StringBuffer(st);
        String  newstr = sb.reverse().toString();

        System.out.println(newstr);
    }
}
