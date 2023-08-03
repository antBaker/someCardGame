import java.util.Random;
import java.util.Arrays;

public class Deck{
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
        
    }
}