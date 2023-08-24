import java.util.Random;
import java.util.Arrays;


public class Deck{

    public static String[] deckOfCards(){
        //creates a deck of cards with suit and rank
        //we don't absolutly need this because we can print the card characters now but I will leave it in because it still may be useful
        char[] suit = {'S', 'D', 'C', 'H'};
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        for(int i = 0; i < deck.length; i++){
            deck[i] = rank[i%13] + suit[i/13];
        }//end of for loop
        return deck;
    }// end of function

    public static void pyramid(String[] deck){
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

    public static String [] printCards(int [] nums){
        /**prints out an array of a deck showing card characters */
        String [] suites = {"A", "B", "C", "D"}; //these are hexadecimal values don't change
        String [] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};// these are also hexadecimal DON'T CHANGE
        String [] out = new String [52];
            int j = 0;
			for(int i:nums){
				//This is done so we don't have either an extra queen or knight card if we want knigh its 12 if we want queen it must be 11
				if(i >= 12 && i < 24 ){
					i = i + 1;
				}else if(i >= 24 && i < 36){
					i += 2;
				}else if(i >= 36 && i < 48){
					i += 3;
				}else if(i >= 48){
					i += 4;
				}
				String card = suites[i/14] + numbers[i%14];
				int c = Integer.parseInt("DC" + card, 16);
				String s = "\uD83C" + (char) c;
                out[j++] = s;
				System.out.print(s + " ");
			}//end of for loop
        return out; // returns array of printed card characters
        }//end of printCards method

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
        
        //String [] shuffledDeck = deckOfCards();
        String [] shuffledDeck = printCards(shuffleDeck(deck));
        //shuffledDeck = shuffleDeck(shuffledDeck);

        //System.out.println(Arrays.toString(deck));
        //shuffleDeck(deck);
        //System.out.println(Arrays.toString(deck));
        pyramid(shuffledDeck);
    }
}