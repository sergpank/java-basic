public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.powIter(2, 3));
        System.out.println(r.powRec(2, 3));
    }

    double powIter(int a, int exp) {
        double result = 1;
        for (int i = 0; i < exp; i++)
        {
            result *= a;
        }
        return result;
    }

    double powRec(int a, int exp)
    {
        if (exp == 0) {
            return 1;
        }
        return a * powRec(a, exp - 1);
    }
}
