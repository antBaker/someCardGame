import java.util.Random;
import java.util.Arrays;


public class Deck{

    private static Card[] deck;

    public Deck(){
        // creates deck of size 52
        deck = new Card[52];
        
        // unsorted ordered set of cards
        for(int i = 0; i < 52; i++){
            deck[i] = new Card(i%13,i/13,i);
        }

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
            out += deck[i].toCardFace();
        }
        return out;
    }


    public static String pyramid(){
        int num = 0;
        String out = "";
        //builds a pyramid out of the shuffled deck
        for(int i=0; i < 8; i++){
            for(int j = 7; j > i; j--){
                out+= " ";
            }
            for (int k = 0; k < i; k++){
                out += deck[num].toCardFace() + " ";
                num += 1;
            }
            out += "\n";
            
        }//end of for loop
        return out;
    }//end of pyramid class

    public void shuffle(){

        Random rand = new Random();
        int range = 52;

        for(int i = this.deck.length - 1; i > -1; i--){
            int r = rand.nextInt(range);
            Card tmp = this.deck[i];
            this.deck[i] = this.deck[r];
            this.deck[r] = tmp;
            range--;
        }
    }
    
}