
import java.util.LinkedList;
import java.util.ListIterator;


public class Demol{


    public static void main(String[] args){

        LinkedList<Integer> li = new LinkedList<>();
        li.add(32);
        li.add(56);
        li.add(89);

        System.out.println(li.poll());
        System.out.println(li.peek());
        System.out.println(li);
        li.push(777);
        li.pop();
       
         System.out.println(li);

       ListIterator<Integer> it =   li.listIterator();

       while(it.hasNext()){
        System.out.println(it.next());
       }

      
       System.out.println( it.previous());

    }
}