import java.util.*;
public class Deck{

    private static Card[] deck;

    public Deck(){
        // creates deck of size 52
        deck = new Card[52];
        
        // unsorted ordered set of cards
        for(int i = 0; i < 52; i++){
            deck[i] = new Card(i%13,i/13);
        }

    }

    public Card getCard(int index){
        return deck[index];
    }

    public int length(){
        return deck.length;
    }

    public Card[] getCardsFrom(int index){
        Card[] cards = new Card[this.length()-index];   // starts from 52 to index in this case from 52-28 = 24
        int i = 0;
        for(Card card: deck){
            if(i == cards.length){
                return cards;
            }
            cards[i] = card;

        }
        return cards;
    }

    public String toString(){
        String out = "";
        for(int i = 0; i < deck.length; i++){
            out += deck[i].toString() + ",";
        }
        return out;
    }

    public String toCards(){
        String out = "";
        for(int i = 0; i < deck.length; i++){
            out += deck[i].toCardFace(i);
        }
        return out;
    }


    public String pyramid(){
        int num = 0;
        String out = "";
        //builds a pyramid out of the shuffled deck
        for(int i=0; i < 8; i++){
            for(int j = 7; j > i; j--){
                out+= " ";
            }
            for (int k = 0; k < i; k++){
                out += deck[num].toCardFace(i) + " ";
                num += 1;
            }
            out += "\n";
            
        }//end of for loop
        return out;
    }//end of pyramid class

    public void shuffle(){

        Random rand = new Random(12345);
        int range = 52;

        for(int i = deck.length - 1; i > -1; i--){
            int r = rand.nextInt(range);
            Card tmp = deck[i];
            deck[i] = deck[r];
            deck[r] = tmp;
            range--;
        }
    }
    
}