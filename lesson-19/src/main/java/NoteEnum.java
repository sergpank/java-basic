public enum NoteEnum {
    __(0),
    C(261.63),
    dC(277.18263097687196),
    bD(277.18263097687196),
    D(293.66476791740746),
    dD(311.1269837220808),
    bE(311.1269837220808),
    E(329.62755691286986),
    F(349.2282314330038),
    dF(369.99442271163434),
    bG(369.99442271163434),
    G(391.99543598174927),
    dG(415.3046975799451),
    bA(415.3046975799451),
    A(440.),
    dA(466.1637615180899),
    bB(466.1637615180899),
    B(493.8833012561241);

    private final double frequency;

    public double getFrequency() {
        return frequency;
    }

    NoteEnum(double hz) {
        this.frequency = hz;
    }
}
