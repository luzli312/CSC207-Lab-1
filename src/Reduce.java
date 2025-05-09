public class Reduce {

    public static void main(String[] args) {

        reduce(7);

    }

    public static void reduce(int n) {

        while (n > 0) {

            if (n % 2 == 0) {

                n = n / 2;

            } else {

                n = n - 1;

            }

        }

    }

}
