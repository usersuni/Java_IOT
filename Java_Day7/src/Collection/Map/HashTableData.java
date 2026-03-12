package Collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableData {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(106,"Nithin");
        ht.put(117,"Akash");
        ht.put(128 ,"Tharun");
        ht.put(100 ,"Krishna");
        ht.put(99,"Sunil");
        ht.put(101,"Shashank");
//        ht.put(null,"Manoj");//no null keys allowed in HashTable
        for(Map.Entry<Integer,String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(ht);
    }
}
