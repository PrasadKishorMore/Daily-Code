import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Pro7 {
    

    public static void main(String[] args){


    //     HashSet<Integer> h = new HashSet<>();
        
    //     h.add(66);
    //     h.add(88);
    //     h.add(00);
    //    Iterator i= h.iterator();

    //    while(i.hasNext()){
    //     System.out.println(i.next());
    //    }

    //   TreeSet<Integer> t = new TreeSet<>();
    //   t.add(43);
    //   t.add(77);

      String str = "prasad";

      System.out.println(str);

      Object ob =  str;

      System.out.println(ob);


      Object o = "kunal";
       str = (String) o;

      System.out.println(str);

      

      char c = 'p';

      int num =Character.valueOf(c);

      System.out.println(num);


      String s1 = "123";

      int val = Integer.parseInt(s1);

      System.out.println(val);

      float f = 3.45f;

      Float v =    Float.valueOf(f);
      //int v = (int) f;

      System.out.println(v);
      
    
    }
}
