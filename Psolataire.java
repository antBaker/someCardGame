public class Psolataire {
    
    public static void main(String[] args){

        Deck deck = new Deck();
        try{
            Pyramid pyramid = new Pyramid(deck);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
