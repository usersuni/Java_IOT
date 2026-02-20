
public class variable {
    static int count = 0;
    int id;

    variable() {
        count++;
        id = count;
        System.out.println("Object Id =" + id);
    }

    public static void main(String[] args) {
        variable v1 = new variable();
        variable v2 = new variable();
        variable v3 = new variable();
        System.out.println("Total objects are = " + count);
    }

}
