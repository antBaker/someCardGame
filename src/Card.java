public class Card {
    
    /**
     * @param args
     */
    // Private Fields
    private Suit suit;
    private Rank rank;
    private boolean isFaceUp = true;

    // Constructor Method
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(boolean isFaceUp){
        this.isFaceUp = false;
    }

    // public Methods
    public String getSuit() {
        return suit.getSuit();
    }

    public String getRank(){
        return rank.printRank();
    }

    public int getRankValue(){
        return rank.getRank();
    }

    public String toString(){
        String str = "";
        if(isFaceUp) {
            str += suit.getSuit() + " " +  rank.printRank() ;
        }else{
            str = "Face down";
        }
        return str;
    }
}
