public class LambdaExamples {
    interface Printable {
        void print(String s);
    }

    interface Operationable {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        Operationable opAnonym = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        int resultAnonym = opAnonym.calculate(10, 20);
        //зьверху и зьнизу адно и тожа, но зьнизу с лямбда-выражением
        Operationable operation = (x, y) -> x + y;
        int result = operation.calculate(10, 20);

        Printable printer = s -> System.out.println(s);
        Printable p2 = System.out::println;
        printer.print("Hello");
        p2.print("Hello");
    }
}
