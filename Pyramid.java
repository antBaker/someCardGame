import java.util.*;

public class Pyramid {
    
    private static int numRows = 0;
    private static ArrayList<Card> pyramid = new ArrayList<Card>();
    private static drawPile drawPile = new drawPile();



    public Pyramid(Deck deck) throws Exception{
        //fill rows
        deck = new Deck();
        deck.shuffle();
        

        // first 28 cards are in pyramid
        for(int i = 0; i < 28; i++){
            pyramid.add(deck.getCard(i));
            numRows++;
        }
        
        for(int i = 28; i < deck.length(); i++){
            try {
                drawPile.add(deck.getCard(i));
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
        //System.out.println(drawPile.toString());
        //System.out.println(pyramid.toString());
    }

    public void printPyramid(){
        int num = 0;
        String out = "";
        //builds a pyramid out of the shuffled deck
        for(int i=0; i < 8; i++){
            for(int j = 7; j > i; j--){
                out+= " ";
            }
            for (int k = 0; k < i; k++){
                out += pyramid.get(num) + "("+ num++ + ") ";
                
            }
            out += "\n";
            
        }//end of for loop
        System.out.println(pyramid.toString());
        System.out.println(pyramid.get(23).toString() + " and the cardFace is " + pyramid.get(23).getFaceValue());
        System.out.println(out);
    }

    public void match(int row, int col){
        // Cols = row*1, row2*2, row3*3, row4*4, row5*5, row6*6, row7*7
        // row1= 1
        // row2 = 2-3
        // row3 = 4-6
        // row4 = 7-10
        // row5 = 11-15
        // row6 = 16-21
        // row7 = 22-28
        int index = (int)(0.5*(float)row*(row-1) + 1) -1 + col  - 1;
        System.out.println("The index chosen is " + index);
        System.out.println(pyramid.get(index).toString() + " " + pyramid.get(index).getFaceValue());
        if(pyramid.get(index).getFaceValue() == 13){
            pyramid.add(index, null);
            pyramid.remove(index + 1);
            
        }else{
            System.out.println("Not a match must equal 13");
        }
        
    }

    public void match(int row, int col, int row2, int col2){
        int idx1 = (int)(0.5*(float)row*(row-1) + 1) + col - 2;
        int idx2 = (int)(0.5*(float)row2*(row2-1) + 1) + col2 - 2;
        if(pyramid.get(idx1).getFaceValue() + pyramid.get(idx2).getFaceValue() == 13 ){
            pyramid.remove(idx1);
            pyramid.remove(idx2);
        }else{
            System.out.println("These card to not match to 13");
        }
    }




}
