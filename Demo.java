
import java.util.ArrayList;



//Collections List

public class Demo{


    public static void main(String[] args){

        @SuppressWarnings("unused")
        Demo d =  new Demo();

        ArrayList<Object> l = new ArrayList();
        
        l.add(12);
        l.add(33);
        l.add(89);
        l.add(67);
        l.add(1);
        System.err.println(l.get(0));
      l.clone();//provide copy of list (object)
      System.err.println(l.clone());

     // l.clear();//remove element

     System.out.println( l.contains(12)); //return true or false
     
     System.out.println(l.isEmpty());
    l.addFirst(90);
    l.addLast(777);
    l.removeFirst();
    l.removeLast();
    l.getFirst();
    l.getLast();
    l.set(2, 7070);


       //Iteration perform

        System.out.println(l);
        java.util.Iterator<Object> li = l.iterator();
 
       System.out.print("[");
        while(li.hasNext()){

            System.out.print((int) li.next());
        }
        System.out.println("]");
  

   
    System.out.println( l.lastIndexOf(l));
    System.out.println(l.indexOf(12));
    
    System.out.println(l.size());
    l.reversed();
    
    
    }

    
    

}