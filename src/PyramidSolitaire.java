import java.util.ArrayList;

public class PyramidSolitaire {
    
    public Deck deckOfCards;
    public static ArrayList<Card> pyramid;
    public static ArrayList<Card> drawPile;
    private int numRows;
    private int draws;
    private int score;

    public PyramidSolitaire(Deck deck, int numRows) throws Exception{
        if(numRows >= 10){
            throw new Exception("Max amount of rows is 9");
        }

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

    public void matchKing(int idx) throws Exception{
        if(pyramid.get(idx).getRankValue() == 13){
            pyramid.set(idx, new Card(false));
        }else{
            throw new Exception("Not a king");
        }
        score += 50;
    }

    public void matchCard(int idx, int idx2) throws Exception{

        if(pyramid.get(idx).getRankValue() + pyramid.get(idx2).getRankValue() == 13){
            pyramid.set(idx, new Card(false));
            pyramid.set(idx2, new Card(false));
        }else{
            throw new Exception("Sorry cards do not match to 13");
        }
        score +=50;

    }

    public void matchFromDraw(int idx, int idx2){
        if(drawPile.get(0).getRankValue() + pyramid.get(idx2).getRankValue() == 13){
            pyramid.set(idx, new Card(false));
            drawPile.remove(0);
        }
    }

    public void drawFromPile() throws Exception{
        
        if(drawPile.size() == 1){
            throw new Exception("Sorry drawPile is empty");
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