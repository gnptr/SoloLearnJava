package last;

import java.util.Iterator;
import java.util.LinkedList;

public class iterators {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
    }
    }

}
