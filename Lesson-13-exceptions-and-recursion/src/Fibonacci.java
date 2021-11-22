public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        for (int i = 0; i <= 100; i++)
        {
            long start = System.currentTimeMillis();
            System.out.printf("Fibonacci %2d = %d ... ", i, f.fibonacci(i));
            System.out.println(System.currentTimeMillis() - start + " ms");
        }
    }

    // 0 1 1 2 3 5 8 13 21 34 ....
    /*
    fib(5) -> fib(4) fib(3)

    fib(4) -> fib(3) fib(2)
    fib(3) -> fib(2) fib(1)

    fib(3) -> fib(2) fib(1)
    fib(2) -> fib(1) fib(0)
    fib(2) -> fib(1) fib(0)
    fib(1)

    fib(2) -> fib(1) fib(0)
    fib(1)
    fib(1)
    fib(0)
    fib(1)
    fib(0)

     */

    long fibonacci(int num) {
        if (num == 0)
            return 0;

        if (num == 1)
            return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
