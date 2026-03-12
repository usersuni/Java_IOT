package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs {
    public static void main(String[] args) {
        Map<String,String> logs = new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","Login");
        logs.put("4","Browse Videos");
        logs.put("3","Scroll up or Scroll down");
        logs.put("5","SignOut");
        System.out.println("API Logs : " + logs);
    }
}
