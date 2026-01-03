import java.util.ArrayList;
import java.util.List;

public class Pro4 {
    

    public static void main(String[] args){

        String arr[] = new String[5];

        List<String> list = new ArrayList<>();

        list.add("prasad");
        list.add("prakash");

        System.out.println(list);


        list.size();
        System.out.println(list.size());
        System.out.println(list.contains("prasad"));
        System.out.println(list.isEmpty());
        System.out.println(list.remove("prakash"));

     
        System.out.println(list.set(0,"manoj"));
        
         
    }
}
