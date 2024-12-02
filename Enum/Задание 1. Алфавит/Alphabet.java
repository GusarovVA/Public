class Alphabet {
    Letter letter; // Changed to use the Letter enum

    public Alphabet(Letter letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Alphabet {" + "буква - " + letter.name() + '\'' + ", номер - " + (letter.ordinal() + 1) + '}';
    }

    enum Letter {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
    }
}
