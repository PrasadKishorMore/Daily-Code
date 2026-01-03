
package Java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class J6{


    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();

        a.add(123);
        a.add(66);
        a.add(77);

        System.out.println(a);

        for(int i=0; i<a.size(); i++){

            System.out.println(a.get(i));
        }

        a.remove(1);

        System.out.println(a);

       Iterator<Integer> it= a.iterator();

       while (it.hasNext()) {
        
        System.out.println(it.next());
       }

       Collections.sort(a);

       System.out.println(a);

       Collections.reverse(a);
       
       System.out.println(a);

       

       
    }
}