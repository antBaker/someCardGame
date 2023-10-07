import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;

public class Deck {
    
    private static ArrayList<Card> deck;
    

    // Constructor
    public Deck(){
        // creates an array list of cards

        deck = new ArrayList<Card>();
        
        // unsorted ordered set of cards
        for(int i = 0; i < 13; i++){
            
            Rank value = Rank.values()[i];

            for(int j = 0; j < 4; j++){
                Card card = new Card(value, Suit.values()[j]);
                deck.add(card);
            }// end for loop
        }// end for loop
        
        //Collections.shuffle(deck);
    } // end deck

    public void shuffle(){

        Random rand = new Random(12345);
        int range = 52;
        Card [] cards = new Card[deck.size()];

        // put arraylist cards in to card array to shuffle
        for(int i = 0; i < deck.size(); i ++){
            cards[i] = deck.get(i);
        }

        for(int i = deck.size() - 1; i >= 0; i--){ // builds from the end and places cards randomly going down array
            int r = rand.nextInt(range);
            Card tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
            range--; // decrement range as the random numbers need to generate indexes less than the ones already placed
            }
        
            // place back into deck of this instance
        for(int i = 0; i < cards.length; i ++){
            deck.set(i, cards[i]);
        }    

        //Collections.shuffle(deck);
    }

    public Card getCard(int index){
        return deck.get(index);
    }

    public void printCards(){

        Iterator<Card> cardIterator = deck.iterator(); // found card iterator to iterate an arraylist seemed simple enough to implement

        while (cardIterator.hasNext())
        {
          Card aCard = cardIterator.next();
          System.out.println(aCard.getRank() + " of " + aCard.getSuit());
        }
    }
}
