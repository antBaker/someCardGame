import java.util.Random;
import java.util.Arrays;

public class Deck{

    public static String[] deckOfCards(){
        //creates a deck of cards with suit and rank
        char[] suit = {'S', 'D', 'C', 'H'};
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        for(int i = 0; i < deck.length; i++){
            deck[i] = rank[i%13] + suit[i/13];
        }//end of for loop
        return deck;
    }// end of function

    public static void pyramid(int[] deck){
        int num = 0;
        //builds a pyramid out of the shuffled deck
        for(int i=0; i < 8; i++){
            for(int j = 7; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print(deck[num] + " ");
                num += 1;
            }
            System.out.println();
        }//end of for loop
    }//end of pyramid class

    public static int [] shuffleDeck(int [] nums){

        Random rand = new Random();
        int range = 52;

        for(int i = nums.length - 1; i > -1; i--){
            int r = rand.nextInt(range);
            int tmp = nums[i];
            nums[i] = nums[r];
            nums[r] = tmp;
            range--;
        }

        return nums;
    }
    public static void main(String[] args){
        int [] deck = new int [52]; //52 size of deck
        for(int i = 0; i < 52; i++){
            deck[i] = i;
        }
        
        int [] shuffledDeck = shuffleDeck(deck);

        System.out.println(Arrays.toString(deck));
        shuffleDeck(deck);
        System.out.println(Arrays.toString(deck));
        pyramid(deck);
    }
}