import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PyramidSolitaire {
    
    public Deck deckOfCards;
    public static ArrayList<Card> pyramid;
    public static ArrayList<Card> drawPile;
    private int numRows;
    private int draws;
    private int score;

    public PyramidSolitaire(Deck deck, int numRows) {

        deckOfCards = deck;
        this.numRows = numRows;
        pyramid = new ArrayList<>();
        drawPile = new ArrayList<>();
        deckOfCards.shuffle();
    }

    private String printPyramid(ArrayList<Card> cards, int numRows){
        int num = 0;
        String out = "";
        //builds a pyramid out of the shuffled deck
        for(int i=0; i < numRows + 1; i++){
            for(int j = numRows; j > i; j--){
                out+= " ";
            }
            for (int k = 0; k < i; k++){
                out +=  cards.get(num).toString() + "("+ num++ + ") ";
            }
            out += "\n";
            
        }//end of for loop

        return out;
    }

    public String printPyramid(){
        int num = 0;
        String out = "";
        //builds a pyramid out of the shuffled deck
        for(int i=0; i < numRows + 1; i++){
            for(int j = numRows; j > i; j--){
                out+= " ";
            }
            for (int k = 0; k < i; k++){
                out +=  pyramid.get(num).toString() + "("+ num++ + ") ";
            }
            out += "\n";
            
        }//end of for loop

        return out;
    }

    private String printDrawPile(ArrayList<Card> cards){
        String out = "";
        int size = 0;
        out += "Draw Pile ";

        for(int i = 0; i < cards.size(); i++){
            out += cards.get(i).toString() + " ("+i+") ";
            //System.out.print(cards.get(i).toString() + " ");
            size++;
        }

        return "(Size: + " + size + " ) " + out ;
    }

    public String printDrawPile(){
        String out = "";
        int size = 0;
        out += "Draw Pile ";

        for(int i = 0; i < drawPile.size(); i++){
            out += drawPile.get(i).toString() + " ("+i+") ";
            //System.out.print(cards.get(i).toString() + " ");
            size++;
        }

        return "(Size: + " + size + " ) " + out ;
    }

    public boolean validIndex(int index, int row) {
        if(row == 7){
            return true;
        }
        int directBelow = index+row;
        int belowRight = index+row+1;
        if(pyramid.get(directBelow).isFaceUp() && pyramid.get(belowRight).isFaceUp()){
            return false;
        }else{
            return true;
        }
        
    }

    public void matchKing(int idx, int row) throws Exception{

        if(!(validIndex(idx, row))){
            throw new Exception("cards below are not matched");
        }

        if(pyramid.get(idx).getRankValue() == 13 ){
            pyramid.set(idx, new Card(false));
        }else{
            throw new Exception("Not a king");
        }
        score += 50;
    }

    public void matchCard(int idx, int row, int idx2, int row2) throws Exception{
        if(!(validIndex(idx2, row2) && validIndex(idx, row))){
            throw new Exception("Cards below have not been matched");
        }

        if(pyramid.get(idx).getRankValue() + pyramid.get(idx2).getRankValue() == 13){
            pyramid.set(idx, new Card(false));
            pyramid.set(idx2, new Card(false));
        }else{
            throw new Exception("Sorry cards do not match to 13");
        }
        score +=50;

    }

    public void matchFromDraw(int idx, int row){
        if(drawPile.get(0).getRankValue() + pyramid.get(0).getRankValue() == 13){
            pyramid.set(idx, new Card(false));
            drawPile.remove(0);
        }
    }

    public void drawFromPile() throws Exception{
        if(draws == 24*3){
            JOptionPane.showMessageDialog(null,"YOU LOSE!");
            int i = JOptionPane.showOptionDialog(null,"Do you want to try again?", null, 1, 1, null, null, 1);
            System.exit(1);
        }
        if(drawPile.size() == 1){
            throw new Exception("Sorry draw Pile is empty");
        }else{
            drawPile.add(drawPile.get(0));      //adds first index at end
            drawPile.remove(0);                 //removes first index so there's no duplicate card
            draws++;
        }
        

    }

    

    public void setGame() {


        // initalize pyramid cards
        for(int i = 0; i < ((numRows*numRows)+numRows)/2; i ++){
            pyramid.add(deckOfCards.getCard(i));
            //System.out.println(i);
        }
        System.out.println(printPyramid(pyramid, numRows));

        // initialize drawPile cards
        for(int i = Integer.parseInt("" + ((numRows*numRows) + numRows)/2); i < 52; i++){
            drawPile.add(deckOfCards.getCard(i));
        }
        System.out.println(printDrawPile(drawPile));        
    }

    
    

}