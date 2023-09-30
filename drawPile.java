import java.util.*;
public class drawPile {
    
    // cards not in pyramid are in drawablePile intitally
    private static ArrayList<Card> drawablePile;
    
    public drawPile(){
        drawablePile = new ArrayList<>();
    }

    public void add(Card c) throws Exception{
        if(drawablePile.size() == 24){
            // you may not add cars
            throw new Exception("DrawPile is full something went wrong");
        }else{
            drawablePile.add(c); 
        }
        
    }

    public Card drawCard() throws Exception{
        if(drawablePile.isEmpty()){
            throw new Exception("Cannot draw pile is empty");
        }else{
            Card drawn = drawablePile.get(0);
            drawablePile.remove(0);
            return drawn;
        }

    }

    public String toString(){
        return drawablePile.toString();
    }
}
