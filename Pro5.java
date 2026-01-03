import java.util.ArrayList;
import java.util.Iterator;

public class Pro5 {
    


    public static void main(String[] args){

        ArrayList<Integer> list = new  ArrayList<>();

        list.add(32);
        list.add(44);
        list.add(66);

       Iterator i= list.iterator();

        while (i.hasNext()) {
            
            System.out.println(i.next());

            Integer num = (Integer) i.next();

            if(num == 44){
                break;
            }
        }

        System.out.println(list.toString());
        System.out.println(list.toArray());


    }
}
