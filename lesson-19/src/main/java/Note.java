import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note {
    private final static Pattern ANY_NUMBER = Pattern.compile("\\d+");

    private double frequencyHz;
    private int durationMs;

    public Note(String note) {
        Matcher matcher = ANY_NUMBER.matcher(note);

        matcher.find();
        int noteStart = matcher.end();
        matcher.find();

        this.durationMs = 1000 / Integer.valueOf(note.substring(0, noteStart));
        String tone = note.substring(noteStart, matcher.start());
        int octave = Integer.valueOf(note.substring(matcher.start()));

        this.frequencyHz = calcFrequency(tone, octave);
    }

    public double getFrequency() {
        return frequencyHz;
    }

    public int getDuration() {
        return durationMs;
    }

    private double calcFrequency(String tone, int octave) {
        NoteEnum note = NoteEnum.valueOf(tone);
        double frequency = note.getFrequency();
        return frequency * octave;
    }
}
