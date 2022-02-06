import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTone {
    public static void generateTone(double hz, int msecs)
            throws LineUnavailableException {

        //hz *= 2;
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
//        double C3 = 130.81; // do
//        double D3 = 146.83; // re
//        double E3 = 164.81; // mi
//        double F3 = 174.61; // fa
//        double G3 = 196.00; // sol
//        double A3 = 220.00; // la
//        double B3 = 246.94; // si
//        double C4 = 261.63; // do
//
//        double step = Math.pow(2, 1.0 / 12);

        System.out.println("Arguments : " + Arrays.toString(args));

        if (args.length == 0) {
            System.out.println("please provide filename with melody");
            return;
        }

        String melodyFile = args[0];
        System.out.println("parsing file : " + melodyFile);
        List<Note> melody = parseMelody(melodyFile);

        for (Note n : melody)
        {
            generateTone(n.getFrequency(), n.getDuration());
        }
    }

    private static List<Note> parseMelody(String melodyFile) {
        List<Note> melody = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(melodyFile)))
        {
            String line = br.readLine();
            line = line.trim();
            String[] notes = line.split(" ");
            for (String n : notes)
            {
                Note note = new Note(n);
                melody.add(note);
            }
            return melody;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return melody;
    }
}
