import java.util.*;

public class Pyramid {
    
    private static int numRows = 7;
    private static ArrayList<Card> pyramid = new ArrayList<Card>();
    private static drawPile drawPile = new drawPile();



    public Pyramid(Deck deck) throws Exception{
        //fill rows
        deck = new Deck();
        deck.shuffle();
        

        // first 28 cards are in pyramid
        for(int i = 0; i < 28; i++){
            pyramid.add(deck.getCard(i));
        }
        
        for(int i = 28; i < deck.length(); i++){
            try {
                drawPile.add(deck.getCard(i));
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
        System.out.println(drawPile.toString());
        System.out.println(pyramid.toString());
    }


}
