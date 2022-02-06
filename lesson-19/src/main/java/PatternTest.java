import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");

        String note = "4__0";
        Matcher matcher = pattern.matcher(note);

        matcher.find();
        int noteStart = matcher.end();
        matcher.find();

        int duration = Integer.valueOf(note.substring(0, noteStart));
        String tone = note.substring(noteStart, matcher.start());
        int octave = Integer.valueOf(note.substring(matcher.start()));

        System.out.printf("duration = %d ; note = %s ; octave = %d\n", duration, tone, octave);

    }
}
