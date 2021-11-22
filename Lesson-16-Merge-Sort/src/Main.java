public class Main {

    public static void main(String[] args) {

        double step = Math.pow(2, 1.0 / 12);
        System.out.println("step = " + step);

        double A = 440;
        double Gd = A / step;
        double G = Gd / step;
        double Ad = A * step;
        double B = Ad * step;

        double tone = A;

        for (int i = 0; i < 12; i++) {
            System.out.println("i :: " + (tone /= step));
        }

        // System.out.println(Arrays.asList(G, Gd, A, Ad, B));
    }
}
