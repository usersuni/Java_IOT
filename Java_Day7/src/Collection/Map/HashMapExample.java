package Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        //The values can be duplicate,but keys have to be unique
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("01","aaaa");
        hashMap.put("03","bbbb");
        hashMap.put("04","zzzz");
        hashMap.put("02","xxxx");
        for(Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        LinkedHashMap<String,String> hashMap1 = new LinkedHashMap<>();
        hashMap1.put("01","aaaa");
        hashMap1.put("03","bbbb");
        hashMap1.put("04","zzzz");
        hashMap1.put("02","xxxx");
        for(Map.Entry<String,String> entry : hashMap1.entrySet()){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
    }
