import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Pro6 {
    


    public static void main(String[] args){
       
        
        // Vector<String> v = new Vector<>();

        // v.add("prasad");
        // v.add("vikas");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(78);
        list.add(55);
        list.add(88);

        for(int val : list){

            System.out.println(val);
        }

        ListIterator l = list.listIterator();

        while (l.hasNext()) {
            
            System.out.println(l.next());
        }

        System.out.println(l.hasPrevious());

                
    }
}
