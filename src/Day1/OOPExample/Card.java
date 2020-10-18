package Day1.OOPExample;

public class Card {
    private final Rank rank;
    private final Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public Rank getRank() {
        return rank;
    }

    public Suite getSuite() {
        return suite;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", rank, suite);
    }

    // suite
    // rank
    public enum Rank{
        Two,
        Three,
        //...
        Jack,
        Queen,
        Spade
    }

    public enum Suite{
        Hearts,
        Diamonds,
        //..
    }
}
