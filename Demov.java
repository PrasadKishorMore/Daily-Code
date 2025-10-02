
import java.util.Iterator;
import java.util.Vector;



public class Demov{

  public static void main(String args[]){


       @SuppressWarnings("unused")
       Vector<Integer> vec = new Vector<>();

       vec.add(12);
       vec.add(89);
       vec.add(56);

       System.out.println(vec);
       System.out.println(vec.indexOf(56));
       System.out.println(vec.getFirst());
       System.out.println(vec.lastElement());
   

       System.out.println( vec.reversed());
       vec.subList(0, 1).clear();

       System.out.println(vec);
       
       @SuppressWarnings("unused")
       Iterator<Integer> li = vec.iterator();

       while(li.hasNext()){
        System.out.println(li.next());
       }
    }
}