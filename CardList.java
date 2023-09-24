import java.util.*;
public class CardList{
    private LinkedList<Card> cards;

    public CardList(){
        cards = new LinkedList<Card>();
    }

    public void add(Card card){
        cards.add(card);
    }

    public void remove(Card card){
        cards.remove(card);
    }

    public int getSize(){
        return cards.size();
    }

    public Card getCard(int num){
        return cards.get(num);
    }
}