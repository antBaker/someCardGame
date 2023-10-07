public class Game {

    public Game(){

    }

    public void startGame(){
        try{
            Deck deck = new Deck();
            PyramidSolitaire p = new PyramidSolitaire(deck, 7);
            p.setGame();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
