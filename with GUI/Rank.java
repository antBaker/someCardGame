public enum Rank {
    ACE(1, "ACE"), TWO(2, "2"), THREE(3, "3"),
    FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"),
    SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"),
    TEN(10, "10"), JACK(11, "JACK"), QUEEN(12, "QUEEN"),
    KING(13, "KING");

    // Private Fields
    private final int rankValue;
    private final String rankString;

    // Constructor
    private Rank(int rankValue, String rankString) {
        this.rankValue = rankValue;
        this.rankString = rankString;
    }

    // Public Methods
    public int getRank() {
        return rankValue;
    }
    public String printRank(){
        return this.rankString;
    }
}
