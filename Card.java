public class Card{
    private static final String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static final String[] SUITS = {"S", "D", "C", "H"};
    private final String rank;
    private final String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    public String[] getRANKS(){
        return this.RANKS;
    }

    public String[] getSUITS(){
        return this.SUITS;
    }

    public String toString(){
        return this.rank + this.suit;
    }

}