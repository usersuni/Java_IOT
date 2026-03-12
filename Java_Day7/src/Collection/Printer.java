package Collection;

public class Printer<T> {
    T data;
    Printer(T data){
        this.data = data;
    }
    void printValue(){
        System.out.println("Data : "+data);
    }

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(1);
        Printer<String > stringPrinter = new Printer<>("java");
        Printer<Boolean> booleanPrinter = new Printer<>(true);
        Printer<Float> floatPrinter = new Printer<>(1.2f);
        integerPrinter.printValue();
        stringPrinter.printValue();
        booleanPrinter.printValue();
        floatPrinter.printValue();
    }
}
