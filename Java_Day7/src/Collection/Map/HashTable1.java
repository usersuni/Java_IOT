package Collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(106,"Nithin");
        ht.put(117,"Akash");
        ht.put(128 ,"Tharun");
        ht.put(100 ,"Krishna");
        ht.put(99,"Sunil");
        ht.put(101,"Shashank");
        System.out.println(ht.getOrDefault(101,"Not found"));
        System.out.println(ht.getOrDefault(200,"not found"));
        ht.putIfAbsent(104,"Gaurav");//this will be added
        System.out.println("Updated table : "+ht);
        ht.putIfAbsent(99,"Ram");//this won't be added because 99 key is already present
        System.out.println("Updated table : " + ht);
    }
}

