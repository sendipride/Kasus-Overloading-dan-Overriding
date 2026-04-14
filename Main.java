package kasir;

class Kasir {

    int hitungTotal(int a, int b) {
        return a + b;
    }

    int hitungTotal(int a, int b, int c) {
        return a + b + c;
    }

    double hitungTotal(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Kasir k = new Kasir();

        System.out.println(k.hitungTotal(1000, 2000));
        System.out.println(k.hitungTotal(1000, 2000, 3000));
        System.out.println(k.hitungTotal(1000.5, 2000.5));
    }
}