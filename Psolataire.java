public class Psolataire {
    
    public static void main(String[] args){

        Deck deck = new Deck();
        System.out.println(deck.toString());
        System.out.println();

        System.out.println(deck.toCards());

        deck.shuffle();
        System.out.println(deck.toString());
        System.out.println();

        System.out.println(deck.toCards());

        System.out.println(deck.pyramid());
    }
}
