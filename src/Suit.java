public enum Suit {
    HEARTS("♥"),
    SPADES("♠"),
    DIAMONDS("♦"),
    CLUBS("♣");

    private final String value;

    // Constructor
    private Suit(String suitText){
        this.value = suitText;
    }

    // Public Method
    public String getSuit(){
        return value;
    }
}