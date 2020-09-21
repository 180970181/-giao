package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class example3 {
    public static void main(String args[]){
        Set set=new HashSet();
        set.add("世界军事");
        set.add("兵器知识");
        set.add("舰船知识");
        set.add("汉和防务");
        System.out.println(set);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
