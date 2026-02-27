package super_Keyword;

import java.io.*;

class User implements Serializable {
    String name = "Sunil";
    transient String password = "12345";
}

class User1 {
    public static void main(String[] args) throws Exception {
        User u = new User();

        ObjectOutputStream oss =
            new ObjectOutputStream(new FileOutputStream("User.ser"));

        oss.writeObject(u);
        oss.close();
    }
}