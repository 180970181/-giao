package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class example8 {
    public static void main(String args[]){
        Map<String,String> map=new HashMap<>();
        map.put("余鑫明","刘晓");
        map.put("黄旭基","芳芳");
        map.put("刘思懿","彭玉洁");
        Iterator<String> iterator=map.keySet().iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            System.out.println(map.get(key));
        }
    }
}
