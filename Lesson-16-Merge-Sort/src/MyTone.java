import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class MyTone {
    public static void generateTone(double hz, int msecs)
            throws LineUnavailableException {

        hz *= 2;
        //msecs *= 2;

        float frequency = 10000;
        byte[] buf = new byte[2];
        AudioFormat af;

        af = new AudioFormat(frequency, 16, 1, true, false);

        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af);
        sdl.start();
        for (int i = 0; i < msecs * frequency / 1000; i++) {
            double angle = i / (frequency / hz) * 2.0 * Math.PI;
            double sin = Math.sin(angle);
            short data = (short) (sin * Short.MAX_VALUE);
            System.out.println(sin + " :: " + data);
            buf[0] = (byte) data;
            buf[1] = (byte) (data >> 8);
            sdl.write(buf, 0, 2);
        }
        sdl.drain();
        sdl.stop();
        sdl.close();
    }

    public static void main(String[] args) throws LineUnavailableException {
        double C3 = 130.81; // do
        double D3 = 146.83; // re
        double E3 = 164.81; // mi
        double F3 = 174.61; // fa
        double G3 = 196.00; // sol
        double A3 = 220.00; // la
        double B3 = 246.94; // si
        double C4 = 261.63; // do

        double step = Math.pow(2, 1.0 / 12);

        generateTone(C3, 1000 / 8);
        generateTone(C3, 1000 / 8);
        generateTone(D3, 1000 / 4);
        generateTone(C3, 1000 / 4);
        generateTone(F3, 1000 / 4);

        generateTone(E3, 1000 / 2);
        generateTone(C3, 1000 / 8);
        generateTone(C3, 1000 / 8);

        generateTone(D3, 1000 / 4);
        generateTone(C3, 1000 / 4);
        generateTone(G3, 1000 / 4);

        generateTone(F3, 1000 / 2);
        generateTone(C3, 1000 / 8);
        generateTone(C3, 1000 / 8);

        generateTone(C4, 1000 / 4);
        generateTone(A3, 1000 / 4);
        generateTone(F3, 1000 / 8);
        generateTone(F3, 1000 / 8);

        generateTone(E3, 1000 / 4);
        generateTone(D3, 1000 / 4);
        generateTone(B3 / step, 1000 / 8);
        generateTone(B3 / step, 1000 / 8);

        generateTone(A3, 1000 / 4);
        generateTone(F3, 1000 / 4);
        generateTone(G3, 1000 / 4);

        generateTone(F3, 1000 / 2);
    }
}
