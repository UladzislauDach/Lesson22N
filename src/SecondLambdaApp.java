public class SecondLambdaApp {
    static int x = 10;
    static int y = 20;

    interface Operation {
        int calculate();
    }

    interface Operationable {
        int calculate(int x, int y);
    }

    public static void main(String[] args) {
        Operation op = () -> {
            x = 30;
            return x + y;
        };
        System.out.println(op.calculate());
        System.out.println(x);

        m2();
    }

    private static void m2() {
        int n = 70;
        int m = 30;
        Operation op = () -> {
            //нельзя менять значения локальных переменных в лямбда-выражении и после   n = 100;
            return m + n;
        };
        // нельзя тож n=100;
        System.out.println(op.calculate());
    }

    private static void m3() {
        Operationable op = (x, y) -> {
            if (y == 0) {
                return 0;
            } else return x / y;
        };
        System.out.println(op.calculate(10, 30));
    }

    interface OperationableGeneric<T> {
        T calculate(T x, T y);
    }

    private static void m4() {
        OperationableGeneric<Integer> o1 = (x, y) -> x + y;
        OperationableGeneric<String> o2 = (x, y) -> x + y;
    }

}
