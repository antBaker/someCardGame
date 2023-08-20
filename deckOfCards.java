public class deckOfCards{

    public static void main(String[] args){
        char[] suit = {'S', 'D', 'C', 'H'};
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        for(int i = 0; i < deck.length; i++){
            deck[i] = rank[i%13] + suit[i/13];
            System.out.println(deck[i]);
        }//end of for loop
    }// end of main

}//end of class