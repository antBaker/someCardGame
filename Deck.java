import java.util.*;
public class Deck{
    private Card[] row1;
    private Card[] row2;
    private Card[] row3;
    private Card[] row4;
    private Card[] row5;
    private Card[] row6;
    private Card[] row7;

    private Card card;
    private CardList cardlist;

    private int remainingCardIndex = 0;

    public Deck(){
        card = new Card("", "");
        cardlist = new CardList();
        row1 = new Card[1];
        row2 = new Card[2];
        row3 = new Card[3];
        row4 = new Card[4];
        row5 = new Card[5];
        row6 = new Card[6];
        row7 = new Card[7];
    }

    public void deckOfCards(){
        String[] ranks = card.getRANKS();
        String[] suits = card.getSUITS();
        Card[] deck = new Card[52];
        for(int i = 0; i < deck.length; i++){
            deck[i] =new Card(ranks[i%13], suits[i/13]);
        }
        deck = shuffleDeck(deck);
        for(int i = 0; i < deck.length; i++){
            cardlist.add(deck[i]);
        }
    }

    public Card[] shuffleDeck(Card[] nums){

        Random rand = new Random();
        int range = 52;

        for(int i = nums.length - 1; i > -1; i--){
            int r = rand.nextInt(range);
            Card tmp = nums[i];
            nums[i] = nums[r];
            nums[r] = tmp;
            range--;
        }
        return nums;
    }

    public void storeCards(){
        for(int i = 0; i < 28; i++){
            if(i == 0){
                row1[i] = cardlist.getCard(i);
            }
            if( i >= 1 && i <= 2){
                row2[i - 1] = cardlist.getCard(i);
            }
            if( i >= 3 && i <=5 ){
                row3[i - 3] = cardlist.getCard(i);
            }
            if( i >= 6 && i <=9){
                row4[i-6] = cardlist.getCard(i);
            }
            if( i >= 10 && i <= 14){
                row5[i - 10] = cardlist.getCard(i);
            }
            if( i >= 15 && i <= 20){
                row6[i-15] = cardlist.getCard(i);
            }
            if(i >= 21 && i <= 27){
                row7[i-21] = cardlist.getCard(i);
            }
        }
    }

    public void pyramid(){
        int num = 0;
        for(int i=0; i < 8; i++){
            for(int j = 7; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print(cardlist.getCard(num) + " ");
                num += 1;
            }
            System.out.println();
        }
        for(int i = 0; i < 28; i++){
            cardlist.remove(cardlist.getCard(0));
        }
    }

    public Card drawCard(){
        if(remainingCardIndex >= cardlist.getSize()){
            remainingCardIndex = 0;
        }
        Card drawnCard = cardlist.getCard(remainingCardIndex);
        remainingCardIndex++;

        return drawnCard;
    }

    public static void main(String[] args){
        Deck deck = new Deck();
        deck.deckOfCards();
        deck.storeCards();
        deck.pyramid();
        for(int i = 0; i < 26; i++){
            Card draw = deck.drawCard();
            System.out.println("Drawn card: " + draw);
        }
    }
}