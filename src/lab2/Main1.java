package lab2;

public class Main1 {
    public static void main(String[] args) {

        // anonymous class     /
        Calculation division = new Calculation() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        };
        System.out.println(division.calculate(8, 2)); // 4

        // lambda expression  x
        Calculation multiplication = (a, b) -> a * b;
        System.out.println(multiplication.calculate(4, 2)); // 8

    }
}
