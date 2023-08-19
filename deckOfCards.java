public class deckOfCards{

    public static void main(String[] args){
        char[] suit = {'S', 'D', 'C', 'H'};
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        int num = 0;
        for(int i =0; i < suit.length; i++){
            for(int j = 0; j < rank.length; j++){
                deck[num] = rank[j] + suit[i];
                System.out.print(deck[num] + " ");
                num += 1;
            }//end of nested for loop
        }//end of for loop

    }//end of main

}//end of class