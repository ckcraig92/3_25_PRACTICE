public class Main {

    public static void main(String[] args) {
        // Math m = new Math();
        int result = Math.multiply(4, 50);
        System.out.println(result);

    }

}

class Math {
    final float PI = 3.14f;

    static int multiply(int p1, int p2) {
        return p1 * p2;

    }

    void printPI() {
        System.out.println(PI);
    }
}